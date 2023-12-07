/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab10.Flyweight.LabTask.trees;

/**
 *
 * @author fa20-bse-017
 */
import GOF.DP_Lab10.Flyweight.LabTask.trees.*;
import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;

        if (isFruitTree) {
            this.color = color.darker(); // Darken the color slightly for fruit trees
        }
    }

    public void draw(Graphics g, int x, int y) {
        int treeSize = adjustTreeSize(y);

        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        if (isFruitTree) {
            drawFruits(g, x, y, treeSize);
        } else {
            g.setColor(color);
            g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);
        }
    }

    private void drawFruits(Graphics g, int x, int y, int treeSize) {
        int fruitRadius = 3;
        g.setColor(Color.RED);
        for (int i = 0; i < countOfFruits; i++) {
            int offsetX = (int) (Math.random() * treeSize) - fruitRadius;
            int offsetY = (int) (Math.random() * treeSize / 2) - fruitRadius;
            g.fillOval(x - treeSize / 2 + offsetX, y - treeSize + offsetY, fruitRadius * 2, fruitRadius * 2);
        }

        g.setColor(color);
        g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);
    }

    private int adjustTreeSize(int y) {
        if (y > 400) {
            return 20;
        } else if (y > 250) {
            return 15;
        } else {
            return 10;
        }
    }
}