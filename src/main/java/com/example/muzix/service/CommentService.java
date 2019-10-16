package com.example.muzix.service;

import com.example.muzix.exceptions.NotFoundException;
import com.example.muzix.model.Comment;
import com.example.muzix.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

  @Autowired
  private CommentRepository commentRepository;

  public CommentService(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  public List<Comment> getAllComments(){
    return commentRepository.findAll();
  }

  public Comment getCommentById(int id){
    return commentRepository.findById(id)
      .orElseThrow(()-> new NotFoundException(id));
  }

  public void addComment(Comment comment){
    commentRepository.save(comment);
  }
  public void updateComment(Comment comment){
    commentRepository.save(comment);
  }
  public void deleteComment(int id){
    commentRepository.deleteById(id);
  }

  public List<Comment> getCommentOfTrack(int trackId){
    return commentRepository.getCommentOfTrack(trackId);
  }
}
