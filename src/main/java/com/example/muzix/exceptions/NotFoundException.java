package com.example.muzix.exceptions;

public class NotFoundException extends RuntimeException {
  public NotFoundException(int id){
    super("Coudnt not find with matching id");
  }
}
