package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class LocationTest {
    private Location location;
    private Latitude latitude;
    private Longitude longitude;

    @Before
    public void setUp(){
        latitude = new Latitude(8 , Direction.N);
        longitude = new Longitude(2 , Direction.E);
        location = new Location(latitude , longitude);
    }

    @Test
    public void shouldGetTheLatitudeOfTheLocation(){
        Latitude expected = latitude;
        assertEquals(expected ,location.getLatitude() );
    }

    @Test
    public void shouldGetTheLongitudeOfTheLocation(){
        Longitude expected = longitude;
        assertEquals(expected , location.getLongitude());
    }
}
