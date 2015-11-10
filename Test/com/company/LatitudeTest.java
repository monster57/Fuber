package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class LatitudeTest {
    private Latitude latitude;
    @Before
    public void setUp(){
        double degree = 5;
        latitude = new Latitude(degree , Direction.N);
    }
    @Test
    public void shouldGetDegreeOfLatitude(){
        double expected = 5;
        assertEquals(expected , latitude.getDegree(),0.1);
    }

    @Test
    public void shouldGetDirectionOfLatitude(){
        Direction expected = Direction.N;
        assertEquals(expected , latitude.getDirection());
    }

}
