/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab9.Composite.LabTask;

/**
 *
 * @author Zain
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Director director = new Director("Prof. Maroof Shah (Director)", 10000);
        HOD hod1 = new HOD("Prof. Mazhar (HOD)", 8000);
        HOD hod2 = new HOD("Prof. Ahmad (HOD)", 7500);
        Teacher teacher1 = new Teacher("Mukhtiyar Zamin (Teacher)", 5000);
        Teacher teacher2 = new Teacher("Fuzail Jameel (Teacher)", 5500);
        DOO doo = new DOO("Imran Ali (DOO)", 7000);

        director.addSubordinate(hod1);
        director.addSubordinate(hod2);
        hod1.addSubordinate(teacher1);
        hod2.addSubordinate(teacher2);
        director.addSubordinate(doo);
        
        

        EmployeeController controller = new EmployeeController();
        String organogram = controller.generateOrganogram(director);

        System.out.println("Organization Hierarchy:");
        System.out.println(organogram);
        
        director.giveBonus(2000);
        doo.giveBonus(2000);
    }
}