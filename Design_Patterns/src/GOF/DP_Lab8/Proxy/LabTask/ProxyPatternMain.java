/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab8.Proxy.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class ProxyPatternMain {
	
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display(); 
        System.out.println("");

        //image will not be loaded from disk
        image.display(); 	

        Exam virtualProxyExam = new RemoteProxyExam();

        virtualProxyExam.load();

        virtualProxyExam.displayResults("Fa20-bse-017");

        Exam protectedProxyExam = new ProtectedProxyExam("teacher");

        protectedProxyExam.load();
        
        protectedProxyExam.displayResults("anyStudentId");

      
   }
}