package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AJAY on 10-Nov-15.
 */
public class Disposal {
    private List<Car> carSet;

    public Disposal() {
        carSet = new ArrayList<Car>();
    }

    protected void addCar(Car car){
        carSet.add(car);

    }

    protected void removeCar(Car car){
        carSet.remove(car);
    }

    protected List<Car> getCars(){
        return carSet;
    }
}

