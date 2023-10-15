/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.Visitor.RefGuruExample.Visitor;

/**
 *
 * @author Zain
 */
import GOF.DP_Lab6.Visitor.RefGuruExample.Shapes.Circle;
import GOF.DP_Lab6.Visitor.RefGuruExample.Shapes.CompoundShape;
import GOF.DP_Lab6.Visitor.RefGuruExample.Shapes.Dot;
import GOF.DP_Lab6.Visitor.RefGuruExample.Shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
