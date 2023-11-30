/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab9.Composite.LabTask;

/**
 *
 * @author Zain
 */
import java.util.*;

//public class UniversitySubject {

class UniversitySubject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double bonus) {
        for (Observer observer : observers) {
            observer.update(bonus);
        }
    }
}
