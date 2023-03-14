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

public class SpecificGroupList implements Frame {

    String title;

    public SpecificGroupList(String s) {
        // Constructor
        this.title = s;
    }

    public void onAdded() {
        // Load the content from the XML file with Kuix.loadScreen static method

        if (Control.mainInit.torch == 1) {

            Screen screen = Kuix.loadScreen("SpecificGroupList76.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();

        } else {
            Screen screen = Kuix.loadScreen("SpecificGroupList.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
        }

    }

    public boolean onMessage(Object identifier, Object[] arguments) {

        if ("cancel_specific_group".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new menuFrame());
            return false;
        }

        if ("send_specific_group".equals(identifier)) {
            // display a popup message
            //Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            Kuix.getFrameHandler().pushFrame(new menuFrame());
            String send_collegue = (String) arguments[0];
            System.out.println("Print: Entered number: " + send_collegue);

            return false;
        }

        if ("group_number_1".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
         if ("group_number_2".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
          if ("group_number_3".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("ALERT_COLLEGUE"), KuixConstants.ALERT_OK);
            return false;

        }
          if ("group_number_4".equals(identifier)) {
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