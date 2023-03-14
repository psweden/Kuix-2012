package Control;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixMIDlet;
import org.kalmeo.kuix.widget.*;

import View.menuFrame;

public class mainInit extends KuixMIDlet {
    public static final int torch = 0; // om det är '1' sätt in conf till px76
    public static final int mexon_mexoff = 0; // om det är '1' så är >> Mex on
    
    public mainInit(){
        // Constructor
        
    }
	public void initDesktopStyles() {
		// Load the stylesheet from the CSS-like file with Kuix.loadCss static method
		//  note: a stylesheet is not associated with a screen but with the midlet
		//  note 2 : by default '/css/' folder is use to find the 'helloworld.css' file
            
            if(torch == 1){
                Kuix.loadCss("layout76.css");
            }else{
		Kuix.loadCss("layout.css");
            }
	}

	public void initDesktopContent(Desktop desktop) {
		// push the frame into the frameHandler
		Kuix.getFrameHandler().pushFrame(new menuFrame());

	}

}
