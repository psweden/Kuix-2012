/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.*;
import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;

import Control.mainInit;
import View.menuFrame;

public class DateForm implements Frame {
    
    String title;
    
    public DateForm(String s){
        // Constructor
        this.title = s;
    }    
    
	public void onAdded() {
		// Load the content from the XML file with Kuix.loadScreen static method
            
            
		Screen screen = Kuix.loadScreen("DateForm.xml", null);
                screen.setTitle(title);
		// Set the application current screen
		screen.setCurrent();
                
	}

	public boolean onMessage(Object identifier, Object[] arguments) {
		
                if ("cancel".equals(identifier)) {
			// push next frame
			Kuix.getFrameHandler().pushFrame(new menuFrame());
			return false;
		}
                
                if ("send".equals(identifier)) {
			     
                    String argument_1 = (String) arguments[0];
		    String argument_2 = (String) arguments[1];
                    
                    if(argument_1 == null){
                        Kuix.getFrameHandler().pushFrame(new DateForm(Model.LanguageStrings.conference));
                        Kuix.alert("Please: add room number!");
                    }else{
                                       
                    System.out.println("Print Room number: " + argument_1 + "  Print Access code: " + argument_2);
                    Kuix.getFrameHandler().pushFrame(new menuFrame());
                    
                    return false;
                
                    }
		}
		
		// return "true" makes the FramHandler to forward the message to the next frame in the stack
		return true;
	}

	public void onRemoved() {
	}

}