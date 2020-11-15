package com.showroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Showroom {
    private List<String> cars = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCar() {
        System.out.println("Type car mark to add:");
        String car = scanner.nextLine();
        cars.add(car);
    }

    public void displayCars() {
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
