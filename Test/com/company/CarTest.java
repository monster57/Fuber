package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class CarTest {
    private Car pinkCar;
    private Latitude latitude;
    private Longitude longitude;
    @Before
    public void SetUp(){
        String pinkType = "pink";
        latitude = new Latitude(5 , Direction.N);
        longitude = new Longitude(6 , Direction.E);
        pinkCar = new Car(pinkType , latitude , longitude);
    }
    @Test
    public void shouldGetTheTypeOfTheCar(){
        String expected = "pink";
        assertEquals(expected  , pinkCar.getType());
    }

    @Test
    public void shouldGetTheLatitudeOfTheCar(){
        Latitude expected = latitude;
        assertEquals(expected , pinkCar.getLatitude());
    }

    @Test
    public void shouldGetTheLongitudeOfTheCar(){
        Longitude expected = longitude;
        assertEquals(expected , pinkCar.getLongitude());
    }

    @Test
    public void shouldAbleToChangeTheLongitudeOfTheCar(){
        Longitude newLongitude = new Longitude(7 , Direction.E);
        Longitude expected = longitude;
        assertEquals(expected , pinkCar.getLongitude());
        pinkCar.setLongitude(newLongitude);
        expected = newLongitude;
        assertEquals(expected , pinkCar.getLongitude());
    }

    @Test
    public void shouldAbleToChangeTheLatitudeOfTheCar(){
        Latitude newLatitude = new Latitude(9 , Direction.N);
        Latitude expected = latitude;
        assertEquals(expected , pinkCar.getLatitude());
        pinkCar.setLatitude(newLatitude);
        expected = newLatitude;
        assertEquals(expected , pinkCar.getLatitude());
    }
}
