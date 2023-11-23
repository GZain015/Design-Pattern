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
class Human extends Shape {

    public Human() {
        type = "Human";
    }

    @Override
    public void draw() {
        System.out.println("Inside Human::draw() method.");
        System.out.println("  _  ");
        System.out.println("('_')");
        System.out.println("__|__");
        System.out.println("  |  ");
        System.out.println(" _|_ ");
        System.out.println("|   |");
    }
}