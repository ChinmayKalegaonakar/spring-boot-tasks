package com.example.muzix.controller;

import com.example.muzix.model.Track;
import com.example.muzix.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TrackController {

  @Autowired
  private TrackService trackService;

  public TrackController(TrackService trackService) {
    this.trackService = trackService;
  }

  @GetMapping("/")
  public List<Track> getAllTrack(){ return trackService.getAllTracks(); }

  @GetMapping("/track/{id}")
  public Track getOne(@PathVariable int id){ return trackService.getTrackById(id); }

  @PostMapping("/add")
  public Track saveTrack(@RequestBody Track track){
   return trackService.addTrack(track);
  }

  @PutMapping("/update/{id}")
  public void update(@RequestBody Track track, @PathVariable int id){
    trackService.updateTrack(track);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable int id){
    trackService.deleteTrack(id);
  }

  @GetMapping("/search")
  public List<Track> getTrackByName(@RequestParam(value = "trackName" , required = false) String trackName,@RequestParam(value="trackAlbum" ,required = false) String trackAlbum ){
  List<Track> trackByName = trackService.getTrackByName(trackName);
  List<Track> trackByAlbum = trackService.getTrackByAlbum(trackAlbum);
  trackByName.addAll(trackByAlbum);
   return trackByName;
  }

}
