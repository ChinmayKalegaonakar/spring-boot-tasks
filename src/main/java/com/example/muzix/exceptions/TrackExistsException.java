package com.example.muzix.exceptions;

import com.example.muzix.model.Track;

import java.util.Optional;

public class TrackExistsException extends RuntimeException {
  public TrackExistsException(Track track){
    super("Track with following data already exits +" +track.toString());
  }

  public TrackExistsException(Optional<Track> byId) {
    super("Track with following data already exits +" +byId.toString());
  }
}
