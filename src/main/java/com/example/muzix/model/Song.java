package com.example.muzix.model;

import java.util.List;

public class Song {
  private Track track;
  private List<Artist> artists;
  private Label label;
  private List<Comment> comments;

  public Song() {
  }

  public Song(Track track,Label label, List<Comment> comments) {
    this.track = track;
    this.label = label;
    this.comments = comments;
  }

  public Track getTrack() {
    return track;
  }

  public void setTrack(Track track) {
    this.track = track;
  }

  public List<Artist> getArtists() {
    return artists;
  }

  public void setArtists(List<Artist> artists) {
    this.artists = artists;
  }

  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}
