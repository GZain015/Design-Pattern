/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singelton.with;

/**
 *
 * @author fa20-bse-017
 */
public class DP_Lab2 {
    public static void main(String [] args){
        BillingSystem billingSystem = BillingSystem.getInstance();

        billingSystem.generateInvoice("Customer A", 100.0);
        billingSystem.generateInvoice("Customer B", 75.5);
        billingSystem.generateInvoice("Customer C", 200.25);

        billingSystem.printInvoices();
    }
}
