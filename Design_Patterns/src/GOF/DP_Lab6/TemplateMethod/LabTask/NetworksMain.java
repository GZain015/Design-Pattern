/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.TemplateMethod.LabTask;

/**
 *
 * @author Zain
 */

//import GOF.DP_Lab6.TemplateMethod.LabTask.*;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Facebook;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Network;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Twitter;
//import GOF.DP_Lab6.TemplateMethod.LabTask.LinkedIn;
//import GOF.DP_Lab6.TemplateMethod.LabTask.Message;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworksMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GOF.DP_Lab6.TemplateMethod.Networks.Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter\n" +
                "3 - LinkedIn" 
                
        );
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new GOF.DP_Lab6.TemplateMethod.Networks.Facebook(userName, password);
        } else if (choice == 2) {
            network = new GOF.DP_Lab6.TemplateMethod.Networks.Twitter(userName, password);
        } else if (choice == 3) {
            network = new GOF.DP_Lab6.TemplateMethod.Networks.LinkedIn(userName, password);
        } else {
            System.out.println("\nInvalid Option...");
        }
        network.post(message);
    }
}
