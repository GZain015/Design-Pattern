/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab3.observer.eventsManagement;

import java.io.File;


/**
 *
 * @author fa20-bse-017
 */

public class SMSSupportListener implements EventListener{
    
    private String phoneNumber;
    
    public SMSSupportListener(String phoneNumber) {
       this.phoneNumber = phoneNumber;  
    }
    
    
    @Override
//    public void update(String eventType, File file){
    public void update(String eventType, Object file){
       if("sms".equals(eventType)){
//           String message = (String) file;
            SMSData smsData = (SMSData) file;
            String message = smsData.getMessage();
           
            if(message.length() > 160){
               System.out.println("Warning: Default SMS length is too long. Please define a valid default SMS.");
            }
            else{
                sendSMS(message, phoneNumber);
            }
        }
    }
    
    private void sendSMS(String message, String phoneNumber) {
        // Implement the logic to send an SMS here.
        // You can use a third-party SMS gateway or any other method
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
    
}