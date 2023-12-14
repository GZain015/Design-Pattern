/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab11.Interpreter.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class DaughterExpression implements Expression {
    private String mother;
    private String daughter;

    public DaughterExpression(String mother, String daughter) {
        this.mother = mother;
        this.daughter = daughter;
    }

    @Override
    public boolean interpret(String context) {
        String[] parts = context.split(" is a daughter of ");
        if (parts.length == 2) {
            return parts[0].equals(daughter) && parts[1].equals(mother);
        }
        return false;
    }
}