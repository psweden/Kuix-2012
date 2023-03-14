/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;

public class setPresenceFrame implements Frame {
     
    private Form form;
    
    public setPresenceFrame(){
        // Constructor
    }    
	public void onAdded() {
            
		 if(Control.mainInit.torch == 1){
                
                Screen screen = Kuix.loadScreen("set_presencemenu76.xml", null);
                screen.setTitle(Model.LanguageStrings.set_presence);
		// Set the application current screen
		screen.setCurrent();
                
            } else{
		Screen screen = Kuix.loadScreen("set_presencemenu.xml", null);
                screen.setTitle(Model.LanguageStrings.set_presence);
		// Set the application current screen
		screen.setCurrent();
                }
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
            
            if ("remove_presence".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
		if ("will_return_soon".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("gone_home".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("at_ext".equals(identifier)) {
			// display a popup message
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.at_ext));
			return false;
		}
                if ("back_at".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}//DateForm
                if ("out_until".equals(identifier)) {
			// display a popup message
			Kuix.getFrameHandler().pushFrame(new View.DateForm("test"));
			return false;
		}
                if ("in_a_meeting".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("system_1".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("system_2".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("will_return_soon".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("peronal".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("back".equals(identifier)) {
			// push next frame
			Kuix.getFrameHandler().pushFrame(new menuFrame());
			return false;
		}
		
		
		// return "true" makes the FramHandler to forward the message to the next frame in the stack
		return true;
	}

	public void onRemoved() {
	}
}


