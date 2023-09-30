/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab3.observer.eventsManagement;

/**
 *
 * @author fa20-bse-017
 */
import java.io.File;

public class EmailNotificationListener implements EventListener{
    private String email;
    
    public EmailNotificationListener(String email){
        this.email = email;
    }
    
    @Override
//    public void update(String eventType, File file){
    public void update(String eventType, Object file){
//         System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
         System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.toString());
    }
    
}
