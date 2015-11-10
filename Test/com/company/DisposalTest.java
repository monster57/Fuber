package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class DisposalTest {
    private List<Car> carsList ;
    private Disposal disposal;
    private Latitude defaultLatitude;
    private Longitude defaultLongitude;
    private Car car1;
    @Before
    public void setUp(){
        carsList = new ArrayList<Car>();
        disposal = new Disposal();
        defaultLatitude = new Latitude(5 , Direction.N);
        defaultLongitude = new Longitude(2 , Direction.E);
        car1 = new Car("pink" , defaultLatitude , defaultLongitude);
        Car car2 = new Car("white"  , defaultLatitude , defaultLongitude);
        carsList.add(car1);
        carsList.add(car2);
        disposal.addCar(car1);
        disposal.addCar(car2);
    }

    @Test
    public void shouldGetTheCarList(){
        List<Car> expected = carsList;
        assertEquals(expected, disposal.getCars());
    }

    @Test
    public void shouldAddACarToCars(){
        List<Car> expected = carsList;
        Car car3 = new Car("white"  , defaultLatitude , defaultLongitude);
        assertEquals(expected, disposal.getCars());
        disposal.addCar(car3);
        assertNotEquals(expected, disposal.getCars());
        expected.add(car3);
        assertEquals(expected, disposal.getCars());
    }

    public void shouldRemoveACarFromCars(){
        List<Car> expected = carsList;
        assertEquals(expected, disposal.getCars());
        disposal.removeCar(car1);
        assertNotEquals(expected, disposal.getCars());
        expected.remove(car1);
        assertEquals(expected, disposal.getCars());
    }
}
