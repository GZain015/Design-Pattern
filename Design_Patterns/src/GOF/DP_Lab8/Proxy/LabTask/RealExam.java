/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab8.Proxy.LabTask;

/**
 *
 * @author FA20-BSE-017
 */
public class RealExam implements Exam {

   private String examData;

   @Override
   public void load() {
      // Load the exam data (e.g., from a database or file)
      System.out.println("Loading exam data...");
      examData = "Real exam questions and answers";
   }

   @Override
   public void displayResults(String studentId) {
      // Display the results for the specific student
      System.out.println("Displaying results for student " + studentId + ": " + examData);
   }
}