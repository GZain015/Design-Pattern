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
import java.util.ArrayList;
import java.util.List;


public class BillingSystem {
    private static BillingSystem instance;
    private List<Invoice> invoices;
    
    private BillingSystem() {
        invoices = new ArrayList<>();
    }
    
     public static BillingSystem getInstance() {
        if (instance == null) {
            synchronized (BillingSystem.class) {
                if (instance == null) {
                    instance = new BillingSystem();
                }
            }
        }
        return instance;
    }
     
     public void generateInvoice(String customerName, double amount) {
        Invoice invoice = new Invoice(customerName, amount);
        invoices.add(invoice);
        System.out.println("Invoice generated for " + customerName + " with amount $" + amount);
    }

    public void printInvoices() {
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println("Customer: " + invoice.getCustomerName() + ", Amount: Rs " + invoice.getAmount());
        }
    }
    
    private static class Invoice {
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
    
}
