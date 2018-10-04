package com.isansa.pocerrorhandling.exception;

public class AppException extends Exception {
    private String appLocation;
    private String appCause;

    public AppException(String appLocation, String appCause) {
        this.appLocation = appLocation;
        this.appCause = appCause;
    }

    public String getAppLocation() {
        return appLocation;
    }

    public String getAppCause() {
        return appCause;
    }
}
