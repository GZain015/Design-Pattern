/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventsManagement;

/**
 *
 * @author fa20-bse-017
 */

import observer.eventsManagement.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
//    private File file;
    private Object file;
    
    public Editor(){
        this.events = new EventManager("open", "save", "sms");
    }
    
    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }
    
    public void saveFile() throws Exception{
        if(this.file != null){
           events.notify("save", file); 
        }else{
            throw new Exception("Please open a file first.");
        }
    }

    public void sendSMS(String message, String phoneNumber) {
        events.notify("sms", new SMSData(message, phoneNumber));
    }
    
}
