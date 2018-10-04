package com.isansa.pocerrorhandling.exceptionHandling;

import com.isansa.pocerrorhandling.exception.ApiError;
import com.isansa.pocerrorhandling.exception.AppException;
import com.isansa.pocerrorhandling.exception.EntityNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;

@ControllerAdvice
public class AppRestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<Object> handleEntityNotFoundException(Exception exception) {
        AppException ex = (AppException)exception;
        ApiError error = new ApiError(HttpStatus.BAD_REQUEST, ex.getAppCause(), new ArrayList<>());
        return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
    }

}
