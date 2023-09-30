/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Polymorphism.methodOverriding;

/**
 *
 * @author Zain
 */
class  TestBirdDynamic  {
    public  static  void  main(String[] args)  {
        Animal myAnimal =  new Animal();
        myAnimal.eat();
        Bird myBird =  new Bird();
        myBird.eat();
    }
}
