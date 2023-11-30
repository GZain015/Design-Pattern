/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab9.Composite.LabTask;

/**
 *
 * @author Zain
 */

import java.util.ArrayList;
import java.util.List;


class BaseEmployee implements IEmployee {
    protected String name;
    protected double salary;
    protected List<IEmployee> subordinates;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void giveBonus(double bonus) {
        this.salary += bonus;
        System.out.println(this.name + " received a bonus of $" + bonus + ". New salary: $" + this.salary);
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void addSubordinate(IEmployee employee) {
        this.subordinates.add(employee);
    }

    public List<IEmployee> getSubordinates() {
        return this.subordinates;
    }
}
