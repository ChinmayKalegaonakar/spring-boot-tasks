package com.example.muzix.service;

import com.example.muzix.repository.TrackRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackServiceImpl extends TrackService{
  public TrackServiceImpl(TrackRepository trackRepository) {
    super(trackRepository);
  }

}
