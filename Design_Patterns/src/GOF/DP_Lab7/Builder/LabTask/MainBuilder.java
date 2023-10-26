/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.Builder.LabTask;


/**
 *
 * @author fa20-bse-017
 */
import java.util.*;

public class MainBuilder {
    public static void main(String[] args) {
   
        MealBuilder mealBuilder = new MealBuilder();
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Meals Menu: " + "\n"
                + "[1] Prepare Veg Meal" + "\n"
                + "[2] Prepare Non Veg Meal" + "\n"
                + "[3] Prepare Diet Meal" + "\n"
                + "[4] Prepare Tea" + "\n"
                + "[5] Exit" + "\n"
                + "Choose your meal from above: "
            );
            int ch= sc.nextInt() ;
            
            switch(ch){
                case 1:
                    Meal vegMeal = mealBuilder.prepareVegMeal();
                    System.out.println("Veg Meal");
                    vegMeal.showItems();
                    System.out.println("Total Cost: " + vegMeal.getCost());
                    break;
                case 2:
                    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
                    System.out.println("\n\nNon-Veg Meal");
                    nonVegMeal.showItems();
                    System.out.println("Total Cost: " + nonVegMeal.getCost());
                    break;
                case 3:
                    Meal dietMeal = mealBuilder.prepareDietMeal();
                    System.out.println("\n\nDiet Meal");
                    dietMeal.showItems();
                    System.out.println("Total Cost: " + dietMeal.getCost());
                    break;
                case 4:
                    Meal tea = mealBuilder.prepareTea();
                    System.out.println("\n\nTea");
                    tea.showItems();
                    System.out.println("Total Cost: " + tea.getCost());
                    break;
                case 5:
                    System.out.println("\nThanks for visiting us....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Option! Please Choose correct Option....");
                    break;
            }
        
        }
        
        
        

        
       

        

        
   }
}
