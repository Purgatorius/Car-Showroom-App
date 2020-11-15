package com.showroom;

import java.util.*;

public class Showroom {
    private List<Car> cars = new ArrayList<>();
    private Set<String> brands = new HashSet<>();
    private Map<String, Car> plateNumberOfCar = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addCar() {
        System.out.println("Type car brand to add:");
        String brand = scanner.nextLine();

        System.out.println("Type model do you want to have?:");
        String model = scanner.nextLine();

        System.out.println("Type plate number");
        String plateNumber = scanner.nextLine();

        System.out.println("Is this car a Diesel one? (Y/N)");
        String isDieselString = scanner.nextLine();

        boolean isDiesel;

        if (isDieselString.equals("Y")) {
            isDiesel = true;
        } else {
            isDiesel = false;
        }

        Car car1 = new Car(brand, model, plateNumber, isDiesel);

        brands.add(brand);
        plateNumberOfCar.put(plateNumber, car1);

        cars.add(car1);
    }

    public void displayBrands() {
        for (String brand : brands) {
            System.out.println(brand);
        }
    }

    public void displayCarsByPlateNumber(){
        System.out.println("Type the plate number of car:");
        String plateNumber = scanner.nextLine();
        Car car = plateNumberOfCar.get(plateNumber);

        car.displayCarInformation();
    }

    public void displayCars() {
        for (Car car : cars) {
            car.displayCarInformation();
        }
    }
}
