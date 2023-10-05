/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab5.Adapter.MediaAdapter;

/**
 *
 * @author FA20-BSE-017
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
      
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);		
    }
    
}
