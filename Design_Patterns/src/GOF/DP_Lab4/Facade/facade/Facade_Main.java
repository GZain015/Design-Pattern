/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Facade.facade;

/**
 *
 * @author fa20-bse-017
 */
import GOF.DP_Lab4.Facade.video_conversion.*;

import java.io.File;

public class Facade_Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("");
        File aviVideo = converter.convertVideo("youtubevideo.mp4", "avi");
        System.out.println("");
        File oggVideo = converter.convertVideo("youtubevideo.avi", "ogg");
    }
}
