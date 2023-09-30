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
public class DispenserChain {
    Dispenser start;
    public DispenserChain() {
        start = new RupeesDispenser(5000);
        Dispenser d2 = new RupeesDispenser(1000);
        Dispenser d3 = new RupeesDispenser(500);

        start.setNext(d2);
        d2.setNext(d3);
    }
    public void dispense(Currency ammount){
        start.dispense(ammount);
    }
}