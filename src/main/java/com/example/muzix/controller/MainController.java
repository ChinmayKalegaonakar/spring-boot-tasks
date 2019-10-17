package com.example.muzix.controller;


import com.example.muzix.model.*;
import com.example.muzix.service.ArtistService;
import com.example.muzix.service.CommentService;
import com.example.muzix.service.LabelService;
import com.example.muzix.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/all")
public class MainController {

  private TrackService trackService;
  private ArtistService artistService;
  private LabelService labelService;
  private CommentService commentService;

  @Autowired
  public MainController(TrackService trackService, ArtistService artistService, LabelService labelService, CommentService commentService) {
    this.trackService = trackService;
    this.artistService = artistService;
    this.labelService = labelService;
    this.commentService = commentService;
  }

  @GetMapping("/")
  public List<Song> allSongs(){
    List<Track> tracks = trackService.getAllTracks();
    List<Song> songs = new ArrayList<Song>();
    for(Track track:tracks){
      List<Comment> comments = commentService.getCommentOfTrack(track.getTrackId());
      List<Artist> artists = artistService.getArtistOfTrack(track.getTrackId());
      track.setArtists(artists);
      Label label = labelService.getLabelOfTrack(track.getTrackId());
      songs.add(new Song(track,label,comments));
    }
    return songs;
  }
}
