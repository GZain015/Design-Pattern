/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Abstraction;

/**
 *
 * @author Zain
 */
abstract  class  Animal  {
    // abstract methods
    abstract  void  move();
    abstract  void  eat();
    // concrete method
    void  label()  {
        System.out.println("Animal's data:");
    }
}
