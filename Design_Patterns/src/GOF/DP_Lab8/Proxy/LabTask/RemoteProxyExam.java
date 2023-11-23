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
public class RemoteProxyExam implements Exam {

   private RealExam realExam;

   @Override
   public void load() {
      // Load the exam data only once (virtual proxy)
      if (realExam == null) {
         System.out.println("Loading exam data (virtual proxy)...");
         realExam = new RealExam();
         realExam.load();
      }
   }

   @Override
   public void displayResults(String studentId) {
      // Display the results for the specific student
      realExam.displayResults(studentId);
   }
}
