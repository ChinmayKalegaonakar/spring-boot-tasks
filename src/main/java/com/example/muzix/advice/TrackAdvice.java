package com.example.muzix.advice;

import com.example.muzix.exceptions.NotFoundException;
import com.example.muzix.exceptions.TrackExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TrackAdvice {

  @ResponseBody
  @ExceptionHandler(TrackExistsException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String trackExistsAdvice(TrackExistsException ex){
    return ex.getMessage();
  }

  @ResponseBody
  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String NotFoundAdvice(NotFoundException ex){
    return ex.getMessage();
  }
}
