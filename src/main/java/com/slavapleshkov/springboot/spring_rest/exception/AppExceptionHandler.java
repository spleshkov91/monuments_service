package com.slavapleshkov.springboot.spring_rest.exception;

import jakarta.servlet.ServletException;
import jakarta.validation.ValidationException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler({TypeMismatchException.class, EntityNotFoundException.class, MultipartException.class})
    public ResponseEntity<ErrorResponse> entityException(Exception e) {
        ErrorResponse response = new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({BindException.class, ValidationException.class, InvalidEntityException.class, DataIntegrityViolationException.class})
    public ResponseEntity<ErrorResponse> validateException(Exception e) {
        ErrorResponse response = new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public ResponseEntity<ErrorResponse> httpRequestMethodNotSupportedException(ServletException e) {
        ErrorResponse response = new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler({NoHandlerFoundException.class})
    public ResponseEntity<ErrorResponse> noHandlerFoundException(Exception e) {
        ErrorResponse response = new ErrorResponse(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }


}