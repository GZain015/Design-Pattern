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

        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        System.out.print("Input message description: ");
        String description = reader.readLine();

        System.out.println("Choose message type:\n1 - ERROR\n2 - WARNING\n3 - INFO");
        int messageTypeChoice = Integer.parseInt(reader.readLine());
        MessageType messageType = MessageType.ERROR; // Default

        switch (messageTypeChoice) {
            case 2:
                messageType = MessageType.WARNING;
                break;
            case 3:
                messageType = MessageType.INFO;
                break;
        }

        System.out.println("Choose network type:\n1 - Facebook\n2 - Twitter\n3 - LinkedIn");
        int networkTypeChoice = Integer.parseInt(reader.readLine());
        NetworkType networkType = NetworkType.NONE; // Default

        switch (networkTypeChoice) {
            case 1:
                networkType = NetworkType.FACEBOOK;
                break;
            case 2:
                networkType = NetworkType.TWITTER;
                break;
            case 3:
                networkType = NetworkType.LINKEDIN;
                break;
        }

        Message message = new Message(description, messageType, networkType);

        Network[] networks = {new Facebook(userName, password), new Twitter(userName, password), new LinkedIn(userName, password)};

        for (Network network : networks) {
            if (message.getNetworkType() == NetworkType.NONE || message.getNetworkType() == network.getNetworkType()) {
                if (network.post(message)) {
                    System.out.println("Message sent successfully on " + network.getNetworkType());
                } else {
                    System.out.println("Failed to send message on " + network.getNetworkType());
                }
            }
        }
    }
}
