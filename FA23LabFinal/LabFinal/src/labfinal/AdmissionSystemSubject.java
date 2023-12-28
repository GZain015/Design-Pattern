/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zain
 */

class AdmissionSystemSubject {
    private List<AdmissionObserver> observers = new ArrayList<>();

    public void attach(AdmissionObserver observer) {
        observers.add(observer);
    }

    public void detach(AdmissionObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (AdmissionObserver observer : observers) {
            observer.update();
        }
    }
}