/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab8.Prototype.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class PrototypePatternMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());		

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());		

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());	

        Shape clonedFishShape = (Shape) ShapeCache.getShape("4");
        System.out.println("Shape : " + clonedFishShape.getType());

        Shape clonedHumanShape = (Shape) ShapeCache.getShape("5");
        System.out.println("Shape : " + clonedHumanShape.getType());

        Shape clonedFishShape2 = (Shape) ShapeCache.getShape("4");
//        Shape clonedHumanShape2 = (Shape) ShapeCache.getShape("5");

        if (clonedFishShape.equals(clonedFishShape2)) {
              System.out.println("Cloned fishes are the same");
              clonedFishShape.draw();
        } else {
              System.out.println("Cloned fishes are different");
        }
        
        if (clonedFishShape.equals(clonedHumanShape)) {
            System.out.println("Fish and Human are the same");
//            clonedFishShape.draw();
//            clonedHumanShape.draw();
        } else {
            System.out.println("Fish and Human are different");
            clonedFishShape.draw();
            clonedHumanShape.draw();
        }
      
   }
}
