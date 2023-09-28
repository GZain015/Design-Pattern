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
import observer.eventsManagement.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();
    
    public EventManager(String... operations){
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    
    public void subscribe(String eventType, EventListener listener){
       List<EventListener> users = listeners.get(eventType);
       users.add(listener);
    }
    
    public void unsubscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }
    
//    public void notify(String eventType, File file){
    public void notify(String eventType, Object file){
        List<EventListener> users = listeners.get(eventType);
        for(EventListener listener : users){
            listener.update(eventType, file);
        }
    }
    
}
