/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Interfaces;

/**
 *
 * @author Zain
 */
class  TestEagleInterfaces  {
    public  static  void  main(String[] args)  {
        Eagle myEagle =  new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: "  + Bird.numberOfLegs);
        System.out.println("Outer covering: "  + Bird.outerCovering);
    }
}