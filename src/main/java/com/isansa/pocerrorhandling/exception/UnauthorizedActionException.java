package com.isansa.pocerrorhandling.exception;

public class UnauthorizedActionException extends AppException{
    public UnauthorizedActionException(String appLocation, String appCause) {
        super(appLocation, appCause);
    }
}

