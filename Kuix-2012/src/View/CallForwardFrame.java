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

public class CallForwardFrame implements Frame {
    
    
    public CallForwardFrame(){
        // Constructor
    }    
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            if(Control.mainInit.torch == 1){
                
                //Screen screen = Kuix.loadScreen("CallForwardMenu76.xml", null);
                Screen screen = Kuix.loadScreen("CallForwardMenu76.xml", null);
		// Set the application current screen
                screen.setTitle(Model.LanguageStrings.call_forward);
		screen.setCurrent();
                
            } else{
		Screen screen = Kuix.loadScreen("CallForwardMenu.xml", null);
		// Set the application current screen
                screen.setTitle(Model.LanguageStrings.call_forward);
		screen.setCurrent();
                }
	}
	public boolean onMessage(Object identifier, Object[] arguments) {
		if ("all_calls".equals(identifier)) {
			// push next frame
                        String allforward = "All calls";
			Kuix.getFrameHandler().pushFrame(new CallForwardSUBFrame(Model.LanguageStrings.all_calls));
			return false;
		}
		if ("extern_forward".equals(identifier)) {
			// push next frame
                        String extern = "Extern. forward";
			Kuix.getFrameHandler().pushFrame(new CallForwardSUBFrame(Model.LanguageStrings.extern_calls));
			return false;
		}
                if ("intern_forward".equals(identifier)) {
			// push next frame
                        String intern = "Intern. forward";
			Kuix.getFrameHandler().pushFrame(new CallForwardSUBFrame(Model.LanguageStrings.intern_calls));
			return false;
		}
                if ("back_call_forward_frame".equals(identifier)) {
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
