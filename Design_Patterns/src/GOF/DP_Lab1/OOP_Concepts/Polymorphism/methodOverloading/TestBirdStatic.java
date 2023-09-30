/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Polymorphism.methodOverloading;


/**
 *
 * @author Zain
 */
class  TestBirdStatic  {
    public  static  void  main(String[] args)  {
        Bird myBird =  new Bird();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
    }
}
