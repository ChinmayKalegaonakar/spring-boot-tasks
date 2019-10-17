package com.example.muzix.service;

import com.example.muzix.model.Track;

import java.util.List;

interface TrackServiceInterface {
  Track addTrack(Track track);
  Track getTrackById(int id);
  List<Track> getAllTracks();
  void deleteTrack(int id);
  void updateTrack(Track track);
  List<Track> getTrackByName(String trackName);
  List<Track> getTrackByAlbum(String trackAlbum);
}
