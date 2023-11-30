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

interface IEmployee {
    void giveBonus(double bonus);
    double calculateSalary();
//    List<IEmployee> getSubordinates();
    Iterable<IEmployee> getSubordinates();
}