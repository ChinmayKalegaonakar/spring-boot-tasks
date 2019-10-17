package com.example.muzix.repository;

import com.example.muzix.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LabelRepository extends JpaRepository<Label,Integer> {
  @Query(value = "SELECT LABEL_ID FROM SONGMAPPING WHERE TRACK_ID = :trackId",nativeQuery = true)
  int getLabelOfTrack(@Param("trackId") int trackId);
}
