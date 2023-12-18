/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class EasyPaisaPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing EasyPaisa payment: " + amount);
    }
}