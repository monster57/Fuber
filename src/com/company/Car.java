package com.company;

public class Car {
    private String type;
    private Latitude defaultLatitude;
    private Longitude defaultLongitude;

    public Car(String type, Latitude defaultLatitude, Longitude defaultLongitude) {
        this.type = type;
        this.defaultLatitude = defaultLatitude;
        this.defaultLongitude = defaultLongitude;
    }

    public String getType(){
        return type;
    }

    protected Latitude getLatitude(){
        return defaultLatitude;
    }

    protected Longitude getLongitude(){
        return defaultLongitude;
    }

    protected void setLatitude(Latitude latitude){
        this.defaultLatitude = latitude;
    }

    protected void setLongitude(Longitude longitude){
        this.defaultLongitude = longitude;
    }
}


