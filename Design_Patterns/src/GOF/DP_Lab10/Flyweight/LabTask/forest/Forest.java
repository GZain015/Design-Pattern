/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab10.Flyweight.LabTask.forest;

/**
 *
 * @author fa20-bse-017
 */
import GOF.DP_Lab10.Flyweight.LabTask.trees.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}