package View;

import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.core.KuixConstants;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;
import org.kalmeo.kuix.widget.Widget;

import Control.mainInit;
import View.Edit.EditMenuFrame;

public class menuFrame implements Frame {
    
    
    public static String splash_done ="";
    public String startUp_splashscreen = "0";
    
    public menuFrame() {
        // Constructor
    }   
    
    public void setSplashScreen(){
        
        String smallPathXML = "/xml/splashscreen.xml";
        String largePathXML = "/xml/splashscreen76.xml";
        String pathXML;
        
        if (Control.mainInit.torch == 1) {            
            
            pathXML = largePathXML;
            Widget splash = Kuix.loadWidget(pathXML, null);
            Kuix.splash(4000, splash, "menuFrame");
            
        }
        else {
            
            pathXML = smallPathXML;
            Widget splash = Kuix.loadWidget(pathXML, null);
            Kuix.splash(4000, splash, "menuFrame");
            
        }        
    }

    public void onAdded() {

        if (Control.mainInit.torch == 1) {
            
           if(this.splash_done.equals("")){
                System.out.println("STARTAR SPLASH ..........................");
                this.splash_done = "1";
                setSplashScreen();
            }   
            
            Screen screen = Kuix.loadScreen("menu76.xml", null);
            screen.setTitle(Model.LanguageStrings.mobisma_ui);
            screen.setCurrent();
            

        } else {
            if(this.splash_done.equals("")){
                System.out.println("STARTAR SPLASH ..........................");
                this.splash_done = "1";
                setSplashScreen();
            }
            
            Screen screen = Kuix.loadScreen("menu.xml", null);
            screen.setTitle(Model.LanguageStrings.mobisma_ui);
            screen.setCurrent();
            
        }
    }

    public boolean onMessage(Object identifier, Object[] arguments) {
        
        
        if ("transfer".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new transferFrame());
            return false;
        }
        if ("set_presence".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new setPresenceFrame());
            return false;
        }
        if ("call_forward".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new CallForwardFrame());
            return false;
        }
        if ("voicemail".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("CONFIRM_VOICEMAIL"), KuixConstants.ALERT_NO | KuixConstants.ALERT_YES, "voicemail_YES", null);
            return false;
        }
        if ("voicemail_YES".equals(identifier)) {
            // push next frame
            String voicemail = "4";
            Model.AttributeEvents vc = new Model.AttributeEvents();
            vc.SetVoiceMail(voicemail);
            return false;
        }
        if ("groups".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new GroupsFrame(Model.LanguageStrings.groups));
            return false;
        }
        if ("conference".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 0;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.conference));
            return false;
        }
        if ("mex_is_off".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
            return false;
        }
        if ("minimse".equals(identifier)) {
            // display a popup message
            //Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
            String set_minimaze = "8";
            Model.AttributeEvents minimaze = new Model.AttributeEvents();
            minimaze.SetMinimise(set_minimaze);
            return false;
        }
        if ("about".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new AboutFrame());
            
            return false;
        }
        if ("exitConfirm".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("EXIT_CONFIRM"), KuixConstants.ALERT_YES | KuixConstants.ALERT_NO, "exit", null);
            return false;
        }
        if ("exit_left_menu".equals(identifier)) {

            Kuix.alert(Kuix.getMessage("EXIT_CONFIRM"), KuixConstants.ALERT_YES | KuixConstants.ALERT_NO, "exit", null);
            // get the midlet instance to invoke the Destroy() method
            //mainInit.getDefault().destroyImpl();
            //if the event has been processed, we return 'false' to avoid event forwarding to other frames
            return false;
        }
        if ("exit".equals(identifier)) {
            // get the midlet instance to invoke the Destroy() method
            mainInit.getDefault().destroyImpl();
            //if the event has been processed, we return 'false' to avoid event forwarding to other frames
            return false;
        }
        if ("edit".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("resellers".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
            return false;
        }
        if ("update_configuration".equals(identifier)) {
            // display a popup message
            Kuix.alert(Kuix.getMessage("CREDITS"), KuixConstants.ALERT_OK);
            return false;
        }

        // return "true" makes the FramHandler to forward the message to the next frame in the stack
        return true;
    }

    public void onRemoved() {
    }
}
