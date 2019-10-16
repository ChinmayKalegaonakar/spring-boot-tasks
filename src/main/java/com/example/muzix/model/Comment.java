package com.example.muzix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Comment {
  @Id
  @GeneratedValue
  private int id;
  private int trackId;
  private String content;
  private LocalDateTime timestamp;
  private int likes;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getTrackId() {
    return trackId;
  }

  public void setTrackId(int trackId) {
    this.trackId = trackId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public Comment() {
  }

  public Comment(int trackId, String content, LocalDateTime timestamp, int likes) {
    this.trackId = trackId;
    this.content = content;
    this.timestamp = timestamp;
    this.likes = likes;
  }
}
