package View.Edit;

import View.*;
import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;

public class EditMenuFrame implements Frame {

    String title;
    
    public EditMenuFrame(String s) {
        // Constructor
        this.title = s;
    }       
    public void onAdded() {

        if (Control.mainInit.torch == 1) {
            
            Screen screen = Kuix.loadScreen("EditMenu76.xml", null);
            screen.setTitle(this.title);
            screen.setCurrent();
            
        } else {
          
            Screen screen = Kuix.loadScreen("EditMenu.xml", null);
            screen.setTitle(this.title);
            screen.setCurrent();
            
        }
    }

    public boolean onMessage(Object identifier, Object[] arguments) {
        
        
        if ("access_pbx".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 1;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.access_pbx));
            return false;
        } 
        if ("pbx_int_settings".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 2;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.pbx_int_settings));
            return false;
        } 
        if ("operator_voicemail".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 3;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.operator_voicemail));
            return false;
        } 
        if ("edit_voicemail".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 4;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.edit_voicemail));
            return false;
        } 
        if ("pre_edit_code".equals(identifier)) {
            // push next frame
            View.Form.edit_modes = 5;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.pre_edit_code));
            return false;
        } 
        if ("system".equals(identifier)) {
            View.Form.edit_modes = 6;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.system));
            return false;
        } 
        if ("language".equals(identifier)) {
            View.Form.edit_modes = 7;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.language));
            return false;
        } 
        if ("mex_options".equals(identifier)) {
            View.Form.edit_modes = 8;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.mex_options));
            return false;
        } 
        if ("group_settings".equals(identifier)) {
            View.Form.edit_modes = 9;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.group_settings));
            return false;
        } 
        if ("rename_system_attributes".equals(identifier)) {
            View.Form.edit_modes = 10;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.rename_system_attributes));
            return false;
        } 
        if ("extension_list".equals(identifier)) {
            View.Form.edit_modes = 11;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.extension_list));
            return false;
        } 
        if ("panasonic_spec_options".equals(identifier)) {
           View.Form.edit_modes = 12;
            Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.panasonic_spec_options));
            return false;
        } 
        if ("edit_back".equals(identifier)) {
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