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

public class AboutFrame implements Frame {
    
    
    public AboutFrame(){
        // Constructor
    }    
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            if (Control.mainInit.torch == 1) {
                
                Screen screen = Kuix.loadScreen("AboutUS76.xml", null);
		// Set the application current screen
		screen.setCurrent();
                
            } else {
		Screen screen = Kuix.loadScreen("AboutUS.xml", null);
		// Set the application current screen
		screen.setCurrent();
                
            }
                
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
		
                if ("aboutus_back".equals(identifier)) {
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