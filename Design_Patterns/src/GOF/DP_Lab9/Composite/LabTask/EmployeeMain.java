/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab9.Composite.LabTask;


/**
 *
 * @author fa20-bse-017
 */
public class EmployeeMain {
    public static void main(String[] args) {
   
      Employee CEO = new Employee("Zain","CEO", 30000);

      Employee headSales = new Employee("Qazi","Head Sales", 20000);

      Employee headMarketing = new Employee("Hamza","Head Marketing", 20000);

      Employee clerk1 = new Employee("Babu","Marketing", 10000);
      Employee clerk2 = new Employee("Abdur Rehman","Marketing", 10000);

      Employee salesExecutive1 = new Employee("Asim","Sales", 10000);
      Employee salesExecutive2 = new Employee("Asad","Sales", 10000);

      CEO.add(headSales);
      CEO.add(headMarketing);

      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);

      headMarketing.add(clerk1);
      headMarketing.add(clerk2);

      //print all employees of the organization
      System.out.println(CEO); 
      
      for (Employee headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }		
    }
}
