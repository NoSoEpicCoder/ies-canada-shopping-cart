package com.accenture.modules.items;

import com.accenture.modules.Item;

import java.math.BigDecimal;

public class CD extends Item {

    private String artist;
    private int numberOfTracks;

    public CD(int id, String name, BigDecimal price, String artist, int numberOfTracks){
        super(id, name, ItemType.CD, price);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

}
