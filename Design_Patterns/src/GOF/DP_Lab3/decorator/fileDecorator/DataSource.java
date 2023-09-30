/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab3.decorator.fileDecorator;

/**
 *
 * @author Zain
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
