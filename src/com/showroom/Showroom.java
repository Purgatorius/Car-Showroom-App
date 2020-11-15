package com.showroom;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private List<String> cars = new ArrayList<>();

    public void addCar(String car) {
        cars.add(car);
    }

    public List<String> getCars() {
        return cars;
    }
}
