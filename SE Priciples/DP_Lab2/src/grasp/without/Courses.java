package grasp.without;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fa20-bse-017
 */

    
import java.util.ArrayList;
import java.util.List;

public class Courses {
    public String courseCode;
    public String courseTitle;
    public List<Students> enrolledStudents;
    
    public Courses(String courseCode, String courseTitle){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public String getCourseCode(){
        return courseCode;
    }
    
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public int getEnrollmentCount() {
        return enrolledStudents.size();
    }
    
    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
        student.addEnrolledCourse(this);
    }

    public void removeStudent(Students student) {
        enrolledStudents.remove(student);
        student.removeEnrolledCourse(this);
    }
}