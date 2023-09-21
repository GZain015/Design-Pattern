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

import observer.eventsManagement.Editor;
import observer.eventsManagement.EmailNotificationListener;
import observer.eventsManagement.LogOpenListener;

public class ObserverMain {
    public static void main(String [] args){
        Editor editor = new Editor();
        EmailNotificationListener email = new EmailNotificationListener("admin@example.com");
        SMSSupportListener sms = new SMSSupportListener(email, "admin@example.com");

//        SMSSupportListener sms = new SMSSupportListener();
        

        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", sms);
//        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        
        

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
