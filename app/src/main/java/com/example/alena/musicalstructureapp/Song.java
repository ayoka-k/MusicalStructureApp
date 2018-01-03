package com.example.alena.musicalstructureapp;

public class Song {

    private String mSong;
    private String mArtist;

    public Song(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }
}
