/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan_Approver;

/**
 *
 * @author fa20-bse-017
 */
public interface Approver {
    void setNext(Approver next);
    void process(Loan loan);
}
