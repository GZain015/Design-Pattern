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
public class SonExpression implements Expression {
    private String father;
    private String son;

    public SonExpression(String father, String son) {
        this.father = father;
        this.son = son;
    }

    @Override
    public boolean interpret(String context) {
        String[] parts = context.split(" is a son of ");
        if (parts.length == 2) {
            return parts[0].equals(son) && parts[1].equals(father);
        }
        return false;
    }
}   
