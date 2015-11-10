package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class CustomerTest {
    private Customer customer;
    private Location location;
    private Destination destination;
    @Before
    public void setUp(){
        Latitude locationLatitude = new Latitude(4,Direction.N);
        Longitude locationLongitude = new Longitude(5 , Direction.E);
        Latitude destinationLatitude = new Latitude(8 , Direction.N);
        Longitude destinationLongitude = new Longitude(9 , Direction.E);
        location = new Location(locationLatitude , locationLongitude);
        destination = new Destination(destinationLatitude , destinationLongitude);
        String customerName = "Surajit";
        customer = new Customer(customerName , location , destination);
    }
    @Test
    public void shouldGetTheNameOfTheCustomer(){
        String expected = "Surajit";
        assertEquals(expected ,customer.getCustomerName() );
    }

    @Test
    public void shouldGetTheLocationOfTheCustomer(){
        Location expected = location;
        assertEquals(expected , customer.getLocation());
    }

    @Test
    public void shouldGetTheDestinationOfTheCustomer(){
        Destination expected = destination;
        assertEquals(expected , customer.getDestination());
    }
}
