/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispenser;

/**
 *
 * @author fa20-bse-017
 */
public class RupeesDispenser implements Dispenser{
    Dispenser next = null;
    int worth;

    public RupeesDispenser(int worth) {
        this.worth = worth;
    }

    @Override
    public void setNext(Dispenser next) {
        this.next = next;
    }

    @Override
    public void dispense(Currency ammount) {
        if(ammount.getAmount()>=worth){
            int quotient = ammount.getAmount()/worth;
            int remainder = ammount.getAmount()%worth;
            System.out.println("I am rupees "+worth+" dispenser"+
            " I am dispensing "+quotient+" notes");

            if((remainder!=0)&&(next!=null))
                next.dispense(new Currency(remainder));
        }
        else if (next!=null)
            next.dispense(ammount);
        else{
            System.out.println("Your request of rupees "+
            ammount.getAmount()+" cannot be processed");
        }
    }

}
