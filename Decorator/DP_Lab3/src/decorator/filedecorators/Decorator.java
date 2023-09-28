/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> 8d08b6c31bcdecf03ee6d7233c2ddb8fc39d0074
 */
package decorator.filedecorators;

/**
 *
<<<<<<< HEAD
 * @author fa20-bse-017
 */
public class Decorator {
    
=======
 * @author Zain
 */

import decorator.filedecorators.*;

public class Decorator {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new UTF8Decorator(
                                         new CompressionDecorator(
                                             new EncryptionDecorator(
                                                 new FileDataSource("test.txt"))));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("test.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
>>>>>>> 8d08b6c31bcdecf03ee6d7233c2ddb8fc39d0074
}
