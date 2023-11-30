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
   
      
      Employee Director = new Employee("Zain","Director", 30000);

      Employee hod = new Employee("Qazi","Head of Department", 20000);

      Employee doo = new Employee("Hamza","DOO", 20000);
      
      Employee registerar = new Employee("Hamza","Administration", 20000);

      Employee clerk1 = new Employee("Babu","Marketing", 10000);
      Employee clerk2 = new Employee("Abdur Rehman","Marketing", 10000);

      Employee salesExecutive1 = new Employee("Asim","Sales", 10000);
      Employee salesExecutive2 = new Employee("Asad","Sales", 10000);

      Director.add(hod);
      Director.add(doo);
      Director.add(registerar);

      hod.add(salesExecutive1);
      hod.add(salesExecutive2);

      doo.add(clerk1);
      doo.add(clerk2);

      //print all employees of the organization
      System.out.println(Director); 
      
      for (Employee headEmployee : Director.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }		
    }
}
