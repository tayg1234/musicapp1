package com.cookandroid.musicapp1;

public class Music {
    private final String title;
    private final String artist;
    private final String duration;

    public Music(String title, String artist, String duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }
}
