/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Asgn2;


/**
 *
 * @author Zain
 */
public class TLS_Main {
    public static void main(String[] args) {
        WebApplicationFacade webAppFacade = new WebApplicationFacade();
        UserSessionManager usession = new UserSessionManager();

        webAppFacade.startWebApplication();

        User user = new User("Ghulam_Zain");
        usession.startSession(user);
        webAppFacade.handleRequest(new Request("123", "GET", "Some data"));

        System.out.println();
         
        // Setting a payment strategy before processing payment
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentStrategy easypaisaPaymentStrategy = new EasyPaisaPaymentStrategy();
        
        webAppFacade.setPaymentStrategy(creditCardPaymentStrategy);
        
        webAppFacade.placeOrder();
        webAppFacade.processPayment(100.0);
        
        
        System.out.println();
        
        usession.getUser();

        webAppFacade.setPaymentStrategy(easypaisaPaymentStrategy);
        
        System.out.println();
         
        Document pdfDocument = new Document(new Content());
        webAppFacade.processPDFDocument(pdfDocument);

        System.out.println();
        
        webAppFacade.placeOrder();
        webAppFacade.processPayment(50.0);
        
        
        System.out.println();
         
        Document wordDocument = new Document(new Content());
        webAppFacade.processWordDocument(wordDocument);
        
        System.out.println();
        
        usession.endSession();

        webAppFacade.stopWebApplication();
    }
}
