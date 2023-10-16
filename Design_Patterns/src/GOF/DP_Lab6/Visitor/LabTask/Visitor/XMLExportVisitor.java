/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask.Visitor;

/**
 *
 * @author Zain
 */
import GOF.DP_Lab6.Visitor.LabTask.Visitor.*;
import GOF.DP_Lab6.Visitor.LabTask.Task.*;

public class XMLExportVisitor implements Visitor {

    public String export(Student... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Student shape : args) {
            sb.append(shape.accept(this)).append("\n");
        }
        return sb.toString();
    }


    public String visitStudent(Student cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                (cg) +
                "</compound_graphic>";
    }

    public String visitStrudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

