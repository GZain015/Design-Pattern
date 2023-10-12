/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Iterator.BasicIterator;

/**
 *
 * @author Zain
 */
public interface Iterator {
    boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    void moveToLast();

    void moveToFirst();
}
