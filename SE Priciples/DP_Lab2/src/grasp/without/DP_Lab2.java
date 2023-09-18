/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.without;

/**
 *
 * @author fa20-bse-017
 */
public class DP_Lab2 {
    public static void main(String [] args){
        Courses course1 = new Courses("CSCI101", "Introduction to Computer Science");
        Courses course2 = new Courses("MATH201", "Calculus II");

        Students student1 = new Students("S12345", "Hamza");
        Students student2 = new Students("S67890", "Zain");

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        System.out.println("Courses:");
        System.out.println(course1.getCourseCode() + " - " + course1.getCourseTitle() + " (Enrolled: " + course1.getEnrollmentCount() + ")");
        System.out.println(course2.getCourseCode() + " - " + course2.getCourseTitle() + " (Enrolled: " + course2.getEnrollmentCount() + ")");

        System.out.println("Enrolled Courses for " + student1.getName() + ":");
        for (Courses course : student1.getEnrolledCourses()) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseTitle());
        }

        course1.removeStudent(student1);

        System.out.println("Updated Courses for " + student1.getName() + ":");
        for (Courses course : student1.getEnrolledCourses()) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseTitle());
        }
    }
}
