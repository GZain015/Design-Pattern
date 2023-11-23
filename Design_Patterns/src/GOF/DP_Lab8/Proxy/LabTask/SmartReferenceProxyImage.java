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
public class SmartReferenceProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public SmartReferenceProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (isSupportedFileType()) {
         if (realImage == null) {
            realImage = new RealImage(fileName);
         }
         realImage.display();
      } else {
         System.out.println("Fake display for unsupported image type: " + fileName);
      }
   }

   private boolean isSupportedFileType() {
      // Add logic to determine if the file type is supported
      return fileName.endsWith(".jpg") || fileName.endsWith(".png");
   }
}