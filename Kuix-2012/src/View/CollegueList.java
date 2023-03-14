/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;

import Control.mainInit;
import View.menuFrame;

public class CollegueList implements Frame {

    String title;

    public CollegueList(String s) {
        // Constructor
        this.title = s;
    }

    public void onAdded() {
        // Load the content from the XML file with Kuix.loadScreen static method

        if (Control.mainInit.torch == 1) {

            Screen screen = Kuix.loadScreen("CollegueList76.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();

        } else {
            Screen screen = Kuix.loadScreen("CollegueList.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
        }

    }

    public boolean onMessage(Object identifier, Object[] arguments) {

        if ("cancel_collegue".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new menuFrame());
            return false;
        }

        if ("send_collegue".equals(identifier)) {
            // display a popup message
            //Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            Kuix.getFrameHandler().pushFrame(new menuFrame());
            String send_collegue = (String) arguments[0];
            System.out.println("Print: Entered number: " + send_collegue);

            return false;
        }

        if ("collegue_1".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
         if ("collegue_2".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
          if ("collegue_3".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
           if ("collegue_4".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
            if ("collegue_5".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
             if ("collegue_6".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
              if ("collegue_7".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
               if ("collegue_8".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }

        // return "true" makes the FramHandler to forward the message to the next frame in the stack
        return true;
    }

    public void onRemoved() {
    }
}