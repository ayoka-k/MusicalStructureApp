package com.example.alena.musicalstructureapp;

public class Song {

    private String mSong;
    private String mArtist;
    private int mPlayButton;

    public Song(String song, String artist, int playButton) {
        mSong = song;
        mArtist = artist;
        mPlayButton = playButton;

    }

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getPlayButton() { return mPlayButton; }

}
