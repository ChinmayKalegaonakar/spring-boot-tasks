package com.example.muzix.service;

import com.example.muzix.model.Track;

import java.util.List;

interface TrackServiceInterface {
  public Track addTrack(Track track);
  public Track getTrackById(int id);
  public List<Track> getAllTracks();

  public void deleteTrack(int id);

  public void updateTrack(Track track);

  public List<Track> getTrackByName(String trackName);

  public List<Track> getTrackByAlbum(String trackAlbum);
}
