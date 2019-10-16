package com.example.muzix.repository;

import com.example.muzix.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
  @Query(value = "SELECT * FROM COMMENT WHERE TRACK_ID = :trackId",nativeQuery = true)
  List<Comment> getCommentOfTrack(@Param("trackId") int trackId);
}
