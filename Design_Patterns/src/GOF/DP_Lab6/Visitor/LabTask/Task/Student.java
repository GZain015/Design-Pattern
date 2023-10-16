/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.LabTask.Task;

/**
 *
 * @author Zain
 */
import GOF.DP_Lab6.Visitor.LabTask.Visitor.Visitor;
import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department;
    }
    
    public String accept(Visitor visitor) {
        return visitor.visitStudent(this);
    }
}