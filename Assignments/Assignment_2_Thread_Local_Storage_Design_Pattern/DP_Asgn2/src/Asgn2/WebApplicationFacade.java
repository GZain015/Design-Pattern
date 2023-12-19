/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class WebApplicationFacade {
    private RequestManager requestManager = new RequestManager();
    private PaymentContext paymentContext = new PaymentContext();
    private OrderSubject orderSubject = new OrderSubject();
    private PDFDocumentProcessor pdfDocumentProcessor = new PDFDocumentProcessor();
    private WordDocumentProcessor wordDocumentProcessor = new WordDocumentProcessor();

    public void startWebApplication() {
        System.out.println("Web application started");
    }

    public void stopWebApplication() {
        System.out.println("Web application stopped");
    }

    public void handleRequest(Request request) {
        requestManager.handleRequest(request);
    }

    public void processPayment(double amount) {
        paymentContext.processPayment(amount);
    }

    public void placeOrder() {
        orderSubject.placeOrder();
    }

    public void processPDFDocument(Document document) {
        pdfDocumentProcessor.processDocument(document);
    }

    public void processWordDocument(Document document) {
        wordDocumentProcessor.processDocument(document);
    }
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        paymentContext.setPaymentStrategy(strategy);
    }
}

