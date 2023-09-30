/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Encapsulation;

/**
 *
 * @author Zain
 */
class  TestAnimal  {
    public  static  void  main(String[] args)  {
        Animal myAnimal =  new Animal();
        myAnimal.setName("Eagle");
        myAnimal.setAverageWeight(1.5);
        myAnimal.setNumberOfLegs(2);
        System.out.println("Name: "  + myAnimal.getName());
        System.out.println("Average weight: "  + myAnimal.getAverageWeight()  +  "kg");
        System.out.println("Number of legs: "  + myAnimal.getNumberOfLegs());
    }
}