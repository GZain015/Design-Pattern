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
public class MP3Handler extends BaseHandler{
    String name;

    public MP3Handler(String name) {
        this.name = name;
    }
    @Override
    public void handle(File file) {
        if((file.getType()==Type.MP3)||(file.getType()==Type.GIF)){
            System.out.println("Processing and saving "+file.getType()+" file by "+getName());
        }
        else if (next!= null){
            System.out.println(getName()+" forwards request to "+next.getName());
            next.handle(file);
        }
        else{
            System.out.println("Your request cannot be handled");
        }

    }

    @Override
    public String getName() {
        return name;
    }

}

