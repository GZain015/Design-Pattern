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


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

class Player {
    private State state;
    private boolean playing = false;
    private TrackIterator trackIterator;
    private Timer trackTimer;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        // Creating a playlist
        List<String> playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
        this.trackIterator = new TrackIterator(playlist);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        startTrackTimer(); // Start timer when playback starts
        return "Playing " + trackIterator.getCurrentTrack();
    }

    public String nextTrack() {
        stopTrackTimer(); // Stop timer when changing tracks
        return "Playing " + trackIterator.getNextTrack();
    }

    public String previousTrack() {
        stopTrackTimer(); // Stop timer when changing tracks
        return "Playing " + trackIterator.getPreviousTrack();
    }

    private void startTrackTimer() {
        trackTimer = new Timer();
        trackTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (trackIterator.getCurrentTrack().equals("Track 5") && playing) {
                    stopPlayback();
                    System.out.println("The player is technically damaged. Please reset the player.");
                }
            }
        }, 3000); // 3 seconds
    }

    private void stopTrackTimer() {
        if (trackTimer != null) {
            trackTimer.cancel();
            trackTimer = null;
        }
    }

    private void stopPlayback() {
        setPlaying(false);
        // Additional logic to handle stopping playback
    }

    public void setCurrentTrackAfterStop() {
        // Reset track to the beginning
        this.trackIterator.setCurrentTrack(0);
    }
}