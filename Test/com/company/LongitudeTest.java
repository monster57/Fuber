package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class LongitudeTest {
    private Longitude longitude;
    @Before
    public void setUp(){
        double degree = 10;
        longitude = new Longitude(degree , Direction.E);
    }
    @Test
    public void shouldGetDegreeofLongitude(){
        double expected = 10;
        assertEquals(expected , longitude.getDegree() , 0.1);
    }

    @Test
    public void shouldGetDirectionFromLongitude(){
        Direction expected = Direction.E;
        assertEquals(expected , longitude.getDirection());
    }
}
