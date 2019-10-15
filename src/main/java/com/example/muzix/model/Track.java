package com.example.muzix.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Track {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int trackId;
  private String trackName;
  private String trackAlbum;
  private float trackLength;
  private int trackListens;

  public Track() {
  }

  public Track(String trackName, String trackAlbum,
               float trackLength, int trackListenes) {
    this.trackName = trackName;
    this.trackAlbum = trackAlbum;
    this.trackLength = trackLength;
    this.trackListens = trackListenes;
  }

  public int getTrackId() {
    return trackId;
  }

  public void setTrackId(int trackId) {
    this.trackId = trackId;
  }

  public String getTrackName() {
    return trackName;
  }

  public void setTrackName(String trackName) {
    this.trackName = trackName;
  }

  public String getTrackAlbum() {return trackAlbum; }

  public void setTrackAlbum(String trackAlbum) {
    this.trackAlbum = trackAlbum;
  }

  public float getTrackLength() {
    return trackLength;
  }

  public void setTrackLength(float trackLength) {
    this.trackLength = trackLength;
  }

  public int getTrackListenes() {return trackListens; }

  public void setTrackListenes(int trackListenes) {
    this.trackListens = trackListenes;
  }


}
