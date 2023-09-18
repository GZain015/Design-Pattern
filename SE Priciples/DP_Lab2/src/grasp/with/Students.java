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

class Students {
 private String studentId;
    private String name;
    private List<Courses> enrolledCourses;

    public Students(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addEnrolledCourse(Courses course) {
        enrolledCourses.add(course);
    }

    public void removeEnrolledCourse(Courses course) {
        enrolledCourses.remove(course);
    }
}
