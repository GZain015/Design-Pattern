/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab11.Momento.LabTask.ShapesGen;

/**
 *
 * @author fa20-bse-017
 */

import java.awt.Color;

public class MomentoMain {
     public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(200, 300, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),
                
                new CompoundShape(
                        new Oval(550, 450, 80, 50, Color.YELLOW), 
                        new Dot(590, 475, Color.YELLOW) 
                )
        );
    }
}
