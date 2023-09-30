/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Abstraction;

/**
 *
 * @author Zain
 */
class  TestFish  {
    public  static  void  main(String[] args)  {
        Animal myFish =  new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();
    }
}
