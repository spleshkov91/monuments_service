package com.slavapleshkov.springboot.spring_rest.exception;

public class EntityNotFoundException  extends RuntimeException{

    public EntityNotFoundException(String message) {
        super(message);
    }
}
