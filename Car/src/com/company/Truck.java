package com.company;

public class Truck extends Car {
    private static int truckCounter = 0;

    private int yearOfManufacture;
    private String model;
    private int maxSpeed;

    public Truck(int n, double e, double w) {
        super (n,e,w);
    }
    public Truck(int yearOfManufacture, String model, int maxSpeed) {
        super (yearOfManufacture,model,maxSpeed);
        private int

        Car.carCounter++;
        truckCounter++;
    }
}