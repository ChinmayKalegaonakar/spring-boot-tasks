package com.example.muzix.model;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

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

  @Transient
  private List<Artist> artists;

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

  public int getTrackListens() {return trackListens; }

  public void setTrackListens(int trackListenes) {
    this.trackListens = trackListenes;
  }

  public List<Artist> getArtists() {
    return artists;
  }

  public void setArtists(List<Artist> artists) {
    this.artists = artists;
  }
}
