/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Chain_Of_Responsibility.Loan_Approver;

/**
 *
 * @author fa20-bse-017
 */
public abstract class BaseApprover implements Approver{
    protected Approver next = null;

    public void setNext(Approver next){
        this.next = next;
    }
}
