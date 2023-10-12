/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Iterator.BasicIterator;

/**
 *
 * @author Zain
 */

public class IteratorMain {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        iterator.moveToLast();

        System.out.println("Students with names starting from 'Muhammad':");
        while (iterator.hasPrevious()) {
            Student student = (Student) iterator.previous();
            if (student.getName().startsWith("Muhammad")) {
                System.out.println("Name: " + student.getName());
            }
        }

        iterator.moveToFirst();

        System.out.println("\nAll students:");
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("Name: " + student.getName() + ", RegNo: " + student.getRegNo() + ", Gender: " + student.getGender() + ", Phone: " + student.getPhoneNumber());
        }
    }
}
