/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Handler;

/**
 *
 * @author fa20-bse-017
 */
public class File {
    private String name;
    private String path;
    private Type type;
    public File(String name, String path, Type type) {
        this.name = name;
        this.path = path;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getPath() {
        return path;
    }
    public Type getType() {
        return type;
    }


}
