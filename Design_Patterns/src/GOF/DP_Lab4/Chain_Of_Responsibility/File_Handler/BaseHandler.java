/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Chain_Of_Responsibility.File_Handler;

/**
 *
 * @author fa20-bse-017
 */
public abstract class BaseHandler implements Handler{
    protected Handler next;
    @Override
    public void setNext(Handler next) {
        this.next = next;

    }
}