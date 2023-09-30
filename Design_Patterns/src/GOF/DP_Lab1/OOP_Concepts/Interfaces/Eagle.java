/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab1.OOP_Concepts.Interfaces;

/**
 *
 * @author Zain
 */
class  Eagle  implements Animal, Bird {
    public  void  eat()  {
        System.out.println("Eats reptiles and amphibians.");
    }
    public  void  sound()  {
        System.out.println("Has a high-pitched whistling sound.");
    }
    public  void  fly()  {
        System.out.println("Flies up to 10,000 feet.");
    }
}
