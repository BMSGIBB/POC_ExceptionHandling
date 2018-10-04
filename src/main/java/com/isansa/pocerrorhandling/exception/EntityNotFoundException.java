package com.isansa.pocerrorhandling.exception;

public class EntityNotFoundException extends AppException{
    public EntityNotFoundException(String appLocation, String appCause) {
        super(appLocation, appCause);
    }
}
