/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CricketMatchUpates;


/**
 *
 * @author Zain
 */
public interface CricketMatch {
    void attach(CoverageObserver observer);
    void detach(CoverageObserver observer);
    void notifyAllObservers();
}
