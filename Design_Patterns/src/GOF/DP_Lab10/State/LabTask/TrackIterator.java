/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab10.State.LabTask;

/**
 *
 * @author fa20-bse-017
 */
import java.util.List;

class TrackIterator {
    private List<String> playlist;
    private int currentTrack;

    public TrackIterator(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    public String getCurrentTrack() {
        return playlist.get(currentTrack);
    }

    public String getNextTrack() {
        currentTrack++;
        if (currentTrack >= playlist.size()) {
            currentTrack = 0;
        }
        return getCurrentTrack();
    }

    public String getPreviousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return getCurrentTrack();
    }

    public void setCurrentTrack(int track) {
        if (track >= 0 && track < playlist.size()) {
            currentTrack = track;
        }
    }
}
