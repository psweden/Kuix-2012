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
import View.CollegueList;
import View.menuFrame;

public class transferFrame implements Frame {
    String title = Model.LanguageStrings.transfer;
    
    public transferFrame(){
        // Constructor
        
    }    
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            if(Control.mainInit.torch == 1){
                
                Screen screen = Kuix.loadScreen("transfermenu76.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                
            } else{
		Screen screen = Kuix.loadScreen("transfermenu.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                }
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
		if ("next_transfer_menu".equals(identifier)) {
			// push next frame                        
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.transfer));
			return false;
		}
		if ("resume_transfer_menu".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("ALERT_1"), KuixConstants.ALERT_OK);
			return false;
		}
                if ("back_transfer_menu".equals(identifier)) {
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