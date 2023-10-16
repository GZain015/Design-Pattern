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
import GOF.DP_Lab6.Visitor.LabTask.Task.Student;
import GOF.DP_Lab6.Visitor.LabTask.Visitor.XMLExportVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        Student st = new Student(1, "Zain", 23, "BSE");
        
        
        
//        export(circle, compoundShape);
    }

    private static void export(Student... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
