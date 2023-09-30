/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Chain_Of_Responsibility.Dispenser;

/**
 *
 * @author fa20-bse-017
 */
public interface Dispenser {
    void setNext(Dispenser next);
    void dispense(Currency ammount);
}
