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

public class GroupsFrame implements Frame {
    
    String title;
    
    public GroupsFrame(String s){
        // Constructor
        this.title = s;
    }    
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            if(Control.mainInit.torch == 1){
                
                Screen screen = Kuix.loadScreen("GroupsMenu76.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                
            } else{
		Screen screen = Kuix.loadScreen("GroupsMenu.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                }
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
		if ("login_all_groups".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("ALERTGROUP"), KuixConstants.ALERT_OK);
			return false;
		}
		if ("logout_all_groups".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("ALERTGROUP"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("login_specific_group".equals(identifier)) {
			// display a popup message
			Kuix.getFrameHandler().pushFrame(new SpecificGroupList(Model.LanguageStrings.login_specific_group));
			return false;
		}
		if ("logout_specific_group".equals(identifier)) {
			// display a popup message
			Kuix.getFrameHandler().pushFrame(new SpecificGroupList(Model.LanguageStrings.logout_specific_group));
			return false;
		}
                if ("groups_back".equals(identifier)) {
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