/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventsManagement;

import java.io.File;
import static java.lang.System.err;

/**
 *
 * @author fa20-bse-017
 */

public class SMSSupportListener implements EventListener{
    
    private String sms;
    private String email;
    int smsSize;
    
    public SMSSupportListener(EmailNotificationListener email, String mail) {
       this.email = mail;
       String sms = email.toString();
       
    }
    
    
    @Override
    public void update(String eventType, File file) {
       smsSize = 160;
//       char smsArry [] = sms.toCharArray();
//       if(sms > smsSize){
       if(true){
//           System.out.print("Please define a valid defauld sms...");
//           System.out.print(
                    try{
//                       sms.length();
                    }
                    catch(Exception err){
                        System.out.print("Please define a valid defauld sms...");
                    }
       }
       else{
           System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
       }
    }
    
}
