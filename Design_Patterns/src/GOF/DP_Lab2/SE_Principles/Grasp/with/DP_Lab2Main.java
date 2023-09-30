/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab2.SE_Principles.Grasp.with;

/**
 *
 * @author fa20-bse-017
 */

// University Portal App


import java.util.ArrayList;
import java.util.List;

public class DP_Lab2Main{
    public static void main(String[] args) {
        UniversityPortal portal = new UniversityPortal();

        Courses course1 = new Courses("CSCI101", "Introduction to Computer Science");
        Courses course2 = new Courses("MATH201", "Calculus II");

        portal.addCourse(course1);
        portal.addCourse(course2);

        Students student1 = new Students("S12345", "Hamza");
        Students student2 = new Students("S67890", "Zain");

        portal.addStudent(student1);
        portal.addStudent(student2);

        portal.enrollInCourse("S12345", "CSCI101");
        portal.enrollInCourse("S12345", "MATH201");
        portal.enrollInCourse("S67890", "CSCI101");

        portal.viewCourses();
        portal.viewEnrolledCourses("S12345");
        portal.viewEnrolledCourses("S67890");

        portal.removeCourse("S12345", "CSCI101");

        portal.viewCourses();
        portal.viewEnrolledCourses("S12345");

    }
    
}
