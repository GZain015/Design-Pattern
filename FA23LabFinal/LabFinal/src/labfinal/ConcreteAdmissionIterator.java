/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

/**
 *
 * @author Zain
 */
class ConcreteAdmissionIterator implements AdmissionIterator {
    @Override
    public void first() {
        System.out.println("Admission Iterator: First item");
    }

    @Override
    public void next() {
        System.out.println("Admission Iterator: Next item");
    }

    @Override
    public boolean isDone() {
        System.out.println("Admission Iterator: Checking if done");
        return false;
    }

    @Override
    public Object currentItem() {
        System.out.println("Admission Iterator: Current item");
        return null;
    }
}
