package com.example.muzix.service;

import com.example.muzix.model.Track;
import com.example.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("trackServiceImpl")
public class TrackServiceImpl implements TrackServiceInterface{

  private TrackRepository trackRepository;

  @Autowired
  public TrackServiceImpl(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  public void getMessage(){
    System.out.println("Ran from track service impl");
  }

  @Override
  public Track addTrack(Track track) {
    return null;
  }

  @Override
  public Track getTrackById(int id) {
    return null;
  }

  @Override
  public List<Track> getAllTracks() {
    return null;
  }

  @Override
  public void deleteTrack(int id) {

  }

  @Override
  public void updateTrack(Track track) {

  }

  @Override
  public List<Track> getTrackByName(String trackName) {
    return null;
  }

  @Override
  public List<Track> getTrackByAlbum(String trackAlbum) {
    return null;
  }
}
