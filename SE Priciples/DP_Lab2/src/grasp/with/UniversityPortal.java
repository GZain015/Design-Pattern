/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.with;

/**
 *
 * @author fa20-bse-017
 */

import java.util.ArrayList;
import java.util.List;

public class UniversityPortal implements Portal{
    private List<Students> students;
    private List<Courses> courses;

    public UniversityPortal() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Students student) {
        students.add(student);
    }
    
    public void addCourse(Courses course) {
        courses.add(course);
    }

        
    @Override
    public void viewCourses() {
       System.out.println("Available Courses:");
        for (Courses course : courses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseTitle() + " (Enrolled: " + course.getEnrollmentCount() + ")");
        }
    }

    @Override
    public void enrollInCourse(String studentId, String courseCode) {
        Students student = findStudent(studentId);
        Courses course = findCourse(courseCode);

        if (student != null && course != null) {
            course.enrollStudent(student);
        }
    }

    @Override
    public void viewEnrolledCourses(String studentId) {
        Students student = findStudent(studentId);

        if (student != null) {
            System.out.println(student.getName() + "'s Enrolled Courses:");
            for (Courses course : student.getEnrolledCourses()) {
                System.out.println(course.getCourseCode() + " - " + course.getCourseTitle());
            }
        }
    }

    @Override
    public void removeCourse(String studentId, String courseCode) {
        Students student = findStudent(studentId);
        Courses course = findCourse(courseCode);

        if (student != null && course != null) {
            course.removeStudent(student);
        }
    }
    
    private Students findStudent(String studentId) {
        for (Students student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return null;
    }
    
    private Courses findCourse(String courseCode) {
        for (Courses course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        System.out.println("Course with code " + courseCode + " not found.");
        return null;
    }
    
}
