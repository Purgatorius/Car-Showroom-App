package com.showroom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// This is a simple Java Basic application to management list of cars in the showroom
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Showroom showroom = new Showroom();

        while(shouldContinue) {
            System.out.println(" ");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("This is a simple application to management list of cars in the showroom.");
            System.out.println(" ");
            System.out.println("1. Display available cars");
            System.out.println("2. Add car");
            System.out.println("3. Display available brands");
            System.out.println("4. Find a car by plate number");
            System.out.println("5. Exit");

            System.out.println(" ");
            System.out.println("Choose from 1-5:");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> showroom.displayCars();
                case 2 -> showroom.addCar();
                case 3 -> showroom.displayBrands();
                case 4 -> showroom.displayCarsByPlateNumber();
                case 5 -> shouldContinue = false;
            }
        }
    }
}
