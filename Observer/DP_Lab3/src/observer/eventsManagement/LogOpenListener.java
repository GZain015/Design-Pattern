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
import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
//    public void update(String eventType, File file) {
    public void update(String eventType, Object file) {
//        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.toString());
    }
}