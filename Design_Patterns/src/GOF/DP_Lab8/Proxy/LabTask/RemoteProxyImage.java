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
public class RemoteProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public RemoteProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (realImage == null) {
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}
