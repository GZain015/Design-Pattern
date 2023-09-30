/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Abstraction;

/**
 *
 * @author Zain
 */
class  TestBird  {
    public  static  void  main(String[] args)  {
        Animal myBird =  new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
    }
}

