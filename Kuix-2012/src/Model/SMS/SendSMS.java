/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SMS;

import javax.microedition.io.*;
import javax.microedition.lcdui.*;
import javax.wireless.messaging.*;

public class SendSMS {

   private String DEFAULT_PORT = "16500";
   private MessageConnection mc;
   private NewMessageHandler newMessageHandler;
   private static SendSMS instance;

  public SendSMS(){
    this.newMessageHandler = newMessageHandler;
  }
  public SendSMS(Display display) {
  }

  public static SendSMS getInstance(Display d) {

        if (instance == null) instance = new SendSMS(d);
        return instance;
    }
    public String getSMSC() {
    return System.getProperty("wireless.messaging.sms.smsc");
    }

  public void createServerConnection(String urlNumber)  {
        String url = urlNumber;
        if (mc == null) {
            try {
                String smsc = System.getProperty("wireless.messaging.sms.smsc");
                String p = System.getProperty("WMAFW-ServerPort");
                if (p == null)
                    url = "sms://"+ url + DEFAULT_PORT;
                else
                    url = "sms://" + url + ":"+p.trim();
                    mc = (MessageConnection) Connector.open(url);
                    newMessageHandler = new NewMessageHandler(mc);
                    newMessageHandler.start();

            } catch (Exception e) {
                System.out.println("createMessageConnection Exception: " + e);
            }

        }

    }

    public void sendTextMessage(String status, String smsAdress) {

   String address = smsAdress;
    String message = status;

        if (address.startsWith("sms") == false) {
            address = "sms://" + address;
        }
        try {
            TextMessage tmsg = (TextMessage)mc.newMessage(MessageConnection.TEXT_MESSAGE);

            if (address != null) tmsg.setAddress(address);
            tmsg.setPayloadText(message);
            // Make sure the message can be sent before trying...
            int segcount = mc.numberOfSegments(tmsg);
            if (segcount == 0) {
                //  Message is too long for the underlying protocol...
                alertSegmentationError();
            } else
                //  Send the message.
                mc.send(tmsg);
        } catch(Exception e) {
            //  Handle the exception...
            System.out.println("Exception during sendTextMessage " + e.hashCode());
        }

        System.out.println("Attribut skickat till CT-Server!!!");
    }

  /**
   * alertSegmentationError
   */
  private void alertSegmentationError() {
  }
}
