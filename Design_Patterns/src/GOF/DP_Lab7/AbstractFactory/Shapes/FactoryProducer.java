/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.AbstractFactory.Shapes;

/**
 *
 * @author fa20-bse-017
 */
public class FactoryProducer {
//   public static AbstractFactory getFactory(boolean rounded){   
   public static AbstractFactory getFactory(String Factory){   
      if(Factory == "Rounded"){
         return new RoundedShapeFactory();         
      }else if(Factory == "DoubleBordered"){
          return new DoubleBorderedShapeFactory();
      }else if(Factory == "Simple"){
         return new ShapeFactory();
      }else{
         return new ShapeFactory();
      }
   }
   
//   public AbstractFactory getFactory(){
//       return new ShapeFactory();
//   }
}