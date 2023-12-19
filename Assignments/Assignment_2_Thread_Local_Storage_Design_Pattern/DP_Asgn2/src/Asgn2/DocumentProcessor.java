/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
abstract class DocumentProcessor {
    public final void processDocument(Document document) {
        preProcess();
        processContent(document.getContent());
        postProcess();
    }

    protected abstract void preProcess();

    protected abstract void processContent(Content content);

    protected abstract void postProcess();
}
