/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab9.Command.LabTask;

/**
 *
 * @author fa20-bse-017
 */
public class Stock_Main {
    public static void main(String[] args) {
       Stock abcStock = new Stock();

       BuyStock buyStockOrder = new BuyStock(abcStock);
       SellStock sellStockOrder = new SellStock(abcStock);

       Broker broker = new Broker();
       broker.takeOrder(buyStockOrder);
       broker.takeOrder(sellStockOrder);

       broker.placeOrders();
    } 
}
