package com.showroom;

public class Car {
    private String brand;
    private String model;
    private String plateNumber;
    private boolean isDiesel;

    public Car(String brand, String model, String plateNumber, boolean isDiesel) {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.isDiesel = isDiesel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void displayCarInformation(){
        System.out.println(" ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate Number: " + plateNumber);
        String isDieselString = isDiesel ? "Diesel engine" : "Petrol engine";
        System.out.println(isDieselString);
    }
}
