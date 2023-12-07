/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab10.Flyweight.LabTask;

/**
 *
 * @author fa20-bse-017
 */
import GOF.DP_Lab10.Flyweight.LabTask.*;
import GOF.DP_Lab10.Flyweight.LabTask.forest.Forest;

import java.awt.*;

public class ForestMain {
     static int CANVAS_SIZE = 500;
//    static int TREES_TO_DRAW = 1000000;
     static int TREES_TO_DRAW = 100021;
//    static int TREE_TYPES = 2;
    static int TREE_TYPES = 3;

    public static void main(String[] args) {
        Forest forest = new Forest();

        // Planting trees in different locations with varying characteristics
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            // Varying tree sizes based on location
//            int treeSize = getTreeSize(i);
//            int treeSize = 6;
            
            // Planting fruit trees with different colors
            Color color = getColorBasedOnLocation(i);
//            boolean isFruitTree = i % 2 == 0; // Alternate trees are fruit trees
            
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
//                    "Summer Oak", color, "Oak texture stub", isFruitTree, 6);
                    "Summer Oak", color, "Oak texture stub", true, 26);

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", color, "Autumn Oak texture stub", false, 30);
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Winter Oak", color, "Winter Oak texture stub", false, 10);
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        // Displaying details
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    // Function to generate colors based on location for fruit trees
    private static Color getColorBasedOnLocation(int index) {
        if (index < TREES_TO_DRAW / 3) {
            return Color.GREEN; // Slightly darker color for trees in the North
        } else if (index < 2 * TREES_TO_DRAW / 3) {
            return Color.YELLOW; // Default color for trees in the Middle
        } else {
            return Color.ORANGE; // Slightly brighter color for trees in the South
        }
    }

    // Function to generate random numbers
    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
