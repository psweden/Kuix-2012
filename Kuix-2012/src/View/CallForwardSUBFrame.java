/*
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

public class CallForwardSUBFrame implements Frame {
    
    String title;
            
    public CallForwardSUBFrame(String s){
        // Constructor
        
        this.title = s;
        
    } 
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            if(Control.mainInit.torch == 1){
                
                Screen screen = Kuix.loadScreen("CallForwardSUBMenu76.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                
            } else{
		Screen screen = Kuix.loadScreen("CallForwardSUBMenu.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                }
            
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
            
            if ("remove_forward".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
            if ("do_not_disturb".equals(identifier)) {
			// display a popup message
			Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
			return false;
		}
            if ("all_calls".equals(identifier)) {
			// push next frame
                        String title = "All calls";                        
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.all_calls));
			return false;
		}
            if ("busy".equals(identifier)) {
			// push next frame
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.busy));
			return false;
		}
            if ("no_answer".equals(identifier)) {
			// push next frame
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.no_answer));
			return false;
		}
           
            if ("busy_no_answer".equals(identifier)) {
			// push next frame
			Kuix.getFrameHandler().pushFrame(new CollegueList(Model.LanguageStrings.busy_no_answer));
			return false;
		}
		
                if ("back_call_forward_sub".equals(identifier)) {
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
