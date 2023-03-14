/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mobisma
 */
public class AttributeEvents {    
    
    public AttributeEvents(){        
        
    }
    
    public void SetVoiceMail(String getAttribute){
        
        String attribute = getAttribute;        
        System.out.println("Skickar det inkommande attributevalet, och ringer röstbrevlådan " + attribute);
    }
    public void SetMinimise(String getAttribute){        
        
        String attribute = getAttribute;        
        System.out.println("Skickar det inkommande attributevalet, och minimerar appen " + attribute);
        
    }
    
}
