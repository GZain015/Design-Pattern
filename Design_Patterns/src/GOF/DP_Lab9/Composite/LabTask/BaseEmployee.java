/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab9.Composite.LabTask;

/**
 *
 * @author Zain
 */

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;


class BaseEmployee implements IEmployee {
    protected String name;
    protected double salary;
    protected double bonus;
    protected List<IEmployee> subordinates;
    private UniversitySubject subject;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
        this.subject = new UniversitySubject();
    }

//    public void giveBonus(double bonus) {
    public void giveBonus(double b) {
        this.bonus = this.salary * b;
        this.salary += bonus;
        System.out.println(this.name + " received a bonus of " + bonus + ". New salary: " + this.salary);
        this.subject.notifyObservers(bonus); // Notify observers about the bonus
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void addSubordinate(IEmployee employee) {
        this.subordinates.add(employee);
        this.subject.attach(employee); // Attach subordinates as observers
    }

    public Iterable<IEmployee> getSubordinates() {
        return this.subordinates;
    }

    public void update(double bonus) {
        System.out.println(this.name + " received a notification about a bonus of " + bonus + "\n");
    }
}
