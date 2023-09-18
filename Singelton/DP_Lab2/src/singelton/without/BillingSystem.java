/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singelton.without;

/**
 *
 * @author fa20-bse-017
 */
import java.util.ArrayList;
import java.util.List;


class Invoice {
    private String customerName;
    private double amount;

    public Invoice(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}

public class BillingSystem {
     private List<Invoice> invoices;

    public BillingSystem() {
        invoices = new ArrayList<>();
    }

    public void generateInvoice(String customerName, double amount) {
        Invoice invoice = new Invoice(customerName, amount);
        invoices.add(invoice);
        System.out.println("Invoice generated for " + customerName + " with amount Rs " + amount);
    }

    public void printInvoices() {
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println("Customer: " + invoice.getCustomerName() + ", Amount: Rs " + invoice.getAmount());
        }
    }

    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        
        billingSystem.generateInvoice("Customer A", 100.0);
        billingSystem.generateInvoice("Customer B", 75.5);
        billingSystem.generateInvoice("Customer C", 200.25);
        
         billingSystem.printInvoices();
    }

}
