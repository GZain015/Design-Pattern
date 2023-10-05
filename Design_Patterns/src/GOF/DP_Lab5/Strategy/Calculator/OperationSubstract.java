/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab5.Strategy.Calculator;

/**
 *
 * @author FA20-BSE-017
 */
public class OperationSubstract extends Computer{
    
    public OperationSubstract(){}
    
    public OperationSubstract(OperationMultiply nextStrategy){
        this.nextStrategy = nextStrategy;
    }
    
    @Override
    public int doOperation(int num1, int num2) {
       return num1 - num2;
    }

    @Override
    public int ComputeInRange(int num1, int num2) {
//        if(num1<= 200 &&  num1>=100 && num2<=200 && num2>=100){
        if(num1<= 100 &&  num1>=1 && num2<=100 && num2>=1){
            return num1 - num2;
        }
        if(nextStrategy==null){
            System.out.println("Support not available...");
        }
        else{
            nextStrategy.ComputeInRange(num1, num2);
        }
    
        return 0;
        
    }

}
