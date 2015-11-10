package com.company;

public class Customer {
    private String name;
    private Location location;
    private Destination destination;

    public Customer(String name, Location location, Destination destination) {
        this.name = name;
        this.location = location;
        this.destination = destination;
    }

    protected String getCustomerName(){
        return name;
    }

    protected Location getLocation(){
        return location;
    }

    protected Destination getDestination(){
        return destination;
    }
}
