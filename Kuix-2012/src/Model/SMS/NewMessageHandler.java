/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SMS;

import javax.wireless.messaging.MessageConnection;

public class NewMessageHandler implements Runnable  {

    private Thread th = new Thread(this);
    private MessageConnection mc;

    public NewMessageHandler() {

    }
    public NewMessageHandler(MessageConnection mc) {
        this.mc = mc;
    }

  public void start() {// startar med anrop från Connectserver-classen
      try {
        th.start();
      }
      catch (Exception e) {
      }

    }
    public String getSMSC() {
        return System.getProperty("wireless.messaging.sms.smsc");
    }

  /**
   * synkroniserar och startar alla träd i hela applikationen
   */
  public void run() {
  }

}
