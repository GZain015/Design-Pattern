package GOF.DP_Lab3.observer.SimpleObserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-017
 */
public class BinaryObserver extends Observer{
    
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
