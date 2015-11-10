package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class DestinationTest {
    private Destination destination;
    private Latitude latitude;
    private Longitude longitude;

    @Before
    public void setUp(){
        latitude = new Latitude(5 , Direction.N);
        longitude = new Longitude(7 , Direction.E);
        destination = new Destination(latitude , longitude);
    }

    @Test
    public void shouldGetTheLatitudeOfTheDestination(){
        Latitude expected = latitude;
        assertEquals(expected , destination.getLatitude());
    }

    @Test
    public void shouldGetTheLongitudeOfTheDestination(){
        Longitude expected = longitude;
        assertEquals(expected , destination.getLongitude());
    }
}
