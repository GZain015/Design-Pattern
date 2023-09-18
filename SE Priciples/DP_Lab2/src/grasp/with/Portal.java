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

interface Portal {
    void viewCourses();
    void enrollInCourse(String studentId, String courseCode);
    void viewEnrolledCourses(String studentId);
    void removeCourse(String studentId, String courseCode);
}
