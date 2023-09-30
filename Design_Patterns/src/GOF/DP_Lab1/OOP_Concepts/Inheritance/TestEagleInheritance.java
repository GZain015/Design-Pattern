/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Inheritance;

/**
 *
 * @author Zain
 */
class  TestEagleInheritance  {
    public  static  void  main(String[] args)  {
        Eagle myEagle =  new Eagle();
        System.out.println("Name: "  + myEagle.name);  System.out.println("Reproduction: "  + myEagle.reproduction);
        System.out.println("Outer covering: "  + myEagle.outerCovering);
        System.out.println("Lifespan: "  + myEagle.lifespan);
        myEagle.flyUp();
        myEagle.flyDown();
    }
}
