/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class PDFDocumentProcessor extends DocumentProcessor {
    protected void preProcess() {
        System.out.println("Performing PDF pre-processing");
    }

    protected void processContent(Content content) {
        System.out.println("Processing PDF content: " + content.toString());
    }

    protected void postProcess() {
        System.out.println("Performing PDF post-processing");
    }
}