package com.company;

/**
 * Created by AJAY on 10-Nov-15.
 */
public abstract class Place {
    private Latitude latitude;
    private Longitude longitude;

    public Place(Latitude latitude, Longitude longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    protected Latitude getLatitude(){
        return latitude;
    }

    protected Longitude getLongitude(){
        return longitude;
    }
}
