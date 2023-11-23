/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab8.Prototype.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class Fish extends Shape{

    public Fish() {
        type = "Fish";
    }
    
    @Override
    void draw() {
        System.out.println("Inside Fish::draw() method.");
        System.out.println(">---('_')");
    }
    
}
