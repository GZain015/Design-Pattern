/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab10.State.MediaPlayer;

/**
 *
 * @author fa20-bse-017
 */
import GOF.DP_Lab10.State.MediaPlayer.States.*;
import GOF.DP_Lab10.State.MediaPlayer.UI.*;


public class StateMain {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
