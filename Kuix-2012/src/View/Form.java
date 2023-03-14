/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Edit.EditMenuFrame;
import org.kalmeo.kuix.core.Kuix;
import org.kalmeo.kuix.widget.Screen;
import org.kalmeo.util.frame.Frame;




public class Form implements Frame {
    
    public static int edit_modes = 0; // Kan andra edit mode
    String title;

    public Form(String s) {
        // Constructor
        this.title = s;
    }

    public void onAdded() {
        // Load the content from the XML file with Kuix.loadScreen static method
        
        if (edit_modes == 12) {
            
            Screen screen = Kuix.loadScreen("FormPanSpecOpt.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 11) {
            
            Screen screen = Kuix.loadScreen("FormExtensionList.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 10) {
            
            Screen screen = Kuix.loadScreen("FormRenameSys_att.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 9) {
            
            Screen screen = Kuix.loadScreen("FormGroupSettings.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 8) {
            
            Screen screen = Kuix.loadScreen("FormMexOptions.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 7) {
            
            Screen screen = Kuix.loadScreen("Form_language.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 6) {
            
            Screen screen = Kuix.loadScreen("Form_system.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 5) {
            
            Screen screen = Kuix.loadScreen("Form_pre_edit_code.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 4) {
            
            Screen screen = Kuix.loadScreen("Form_PBX_edit_voicemail.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 3) {
            
            Screen screen = Kuix.loadScreen("Form_operator_voicemail.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }
        if (edit_modes == 2) {
            
            Screen screen = Kuix.loadScreen("FormPBX_int_settings.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }if (edit_modes == 1) {
            
            Screen screen = Kuix.loadScreen("FormAccessPBX.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
            
        }if (edit_modes == 0) {
            
            Screen screen = Kuix.loadScreen("Form.xml", null);
            screen.setTitle(title);
            // Set the application current screen
            screen.setCurrent();
        }

    }

    public boolean onMessage(Object identifier, Object[] arguments) {

        if ("cancel_form".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new menuFrame());
            return false;
        }  
        
        //  | 
        
        if ("back_pan_block_dial".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_pan_block_dial".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];            
            
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("ON | OFF: " + argument_1); 
                   
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        
        // =========================================
        
        if ("back_extension_list".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_extension_list".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];            
            String argument_3 = (String) arguments[2];
            String argument_4 = (String) arguments[3];
            
            String argument_5 = (String) arguments[4];
            String argument_6 = (String) arguments[5];            
            String argument_7 = (String) arguments[6];
            String argument_8 = (String) arguments[7];
            
            String argument_9 = (String) arguments[8];
            String argument_10 = (String) arguments[9];            
            String argument_11 = (String) arguments[10];
            String argument_12 = (String) arguments[11];
            
            String argument_13 = (String) arguments[12];
            String argument_14 = (String) arguments[13];            
            String argument_15 = (String) arguments[14];
            String argument_16 = (String) arguments[15];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("Namn: " + argument_1 + " | Anknytning: " + argument_2); 
                   System.out.println("Namn: " + argument_3 + " | Anknytning: " + argument_4);
                   System.out.println("Namn: " + argument_5 + " | Anknytning: " + argument_6);
                   System.out.println("Namn: " + argument_7 + " | Anknytning: " + argument_8);
                   System.out.println("Namn: " + argument_9 + " | Anknytning: " + argument_10);
                   System.out.println("Namn: " + argument_11 + " | Anknytning: " + argument_12);
                   System.out.println("Namn: " + argument_13 + " | Anknytning: " + argument_14);
                   System.out.println("Namn: " + argument_15 + " | Anknytning: " + argument_16);
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("back_sys_att".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_sys_att".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];            
            String argument_3 = (String) arguments[2];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("sys att1: " + argument_1 + " | sys att2: " + argument_2 + " | personal: " + argument_3); 
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("back_group_settings".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_group_settings".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];
            
            String argument_3 = (String) arguments[2];
            String argument_4 = (String) arguments[3];
            
            String argument_5 = (String) arguments[4];
            String argument_6 = (String) arguments[5];
            
            String argument_7 = (String) arguments[6];
            String argument_8 = (String) arguments[7];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("Name: " + argument_1 + " | Group number: " + argument_2); 
                   System.out.println("Name: " + argument_3 + " | Group number: " + argument_4);
                   System.out.println("Name: " + argument_5 + " | Group number: " + argument_6);
                   System.out.println("Name: " + argument_7 + " | Group number: " + argument_8);
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("back_mex_options".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_mex_options".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("Redirect pause: " + argument_1 + " Lenght of the extension numbers: " + argument_2); 
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }        
        if ("back_language".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_language".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/
               
                   System.out.println("Choosed language: " + argument_1); 
               
                
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }        
        if ("back_system".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("login_system".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("System Login: " + argument_1);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }               
        if ("back_pre_edit_code".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_pre_edit_code".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("Pre Edit Code: " + argument_1);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }          
        if ("back_edit_voicemail".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_edit_voicemail".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("PBX edit voicemail: " + argument_1);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }        
        if ("back_operator_voicemail".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_operator_voicemail".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("Operator voicemail: " + argument_1);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("back_pbx_int_settings".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_pbx_int_settings".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];
            String argument_3 = (String) arguments[2];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("PBX country code: " + argument_1 + "  Int. direct dialling code: " + argument_2 + "  Digit remove areacode: " + argument_3);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("back_access_pbx".equals(identifier)) {
            // push next frame
            Kuix.getFrameHandler().pushFrame(new EditMenuFrame(Model.LanguageStrings.edit_mode));
            return false;
        }
        if ("save_access_pbx".equals(identifier)) {
            
            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];
            String argument_3 = (String) arguments[2];
            String argument_4 = (String) arguments[3];
            /*
            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(View.menuFrame.conference));
                Kuix.alert("Please: add room number!");
            } else {*/

                System.out.println("Line-access: " + argument_1 + "  PBX number: " + argument_2 + "  Extension: " + argument_3 + "  PIN code: " + argument_4);
                Kuix.getFrameHandler().pushFrame(new menuFrame());

                return false;

           // }
        }
        if ("send_form".equals(identifier)) {

            String argument_1 = (String) arguments[0];
            String argument_2 = (String) arguments[1];

            if (argument_1 == null) {
                Kuix.getFrameHandler().pushFrame(new Form(Model.LanguageStrings.conference));
                Kuix.alert("Please: add room number!");
            } else {
                //StartServer();
                String rum = "Rumsnummer: ";
                String message = rum + argument_1;
                String telnumber = argument_2;
                
                //Model.SMS.SendSMS sms_message = new Model.SMS.SendSMS();
                //sms_message.createServerConnection(telnumber);
                //sms_message.sendTextMessage(message, telnumber);
                //CloseServer();

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