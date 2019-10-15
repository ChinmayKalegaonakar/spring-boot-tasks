package com.example.muzix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {
  @Id
  private int artistId;
  @GeneratedValue
  private String artistName;
  public Artist() {
  }

  public Artist(int artistId, String artistName, Label artistLabel) {
    this.artistId = artistId;
    this.artistName = artistName;

  }

  public int getArtistId() {
    return artistId;
  }

  public void setArtistId(int artistId) {
    this.artistId = artistId;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

}
