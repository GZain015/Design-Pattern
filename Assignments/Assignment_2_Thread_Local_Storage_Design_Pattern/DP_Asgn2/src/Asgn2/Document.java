/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asgn2;

/**
 *
 * @author Zain
 */
public class Document {
   private Content content;

    public Document(Content content) {
        this.content = content;
    }

    public Content getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Document with content: " + content.toString();
    }
}
