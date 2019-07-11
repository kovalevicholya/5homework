package com.company;

public class Car {

    public static int carCounter = 0;

    private String description = "Легковая машина";
    private int numberPessengers;
    private String manufacturer;
    private double engineCapacity;
    private double weightAvto;
    private final int WEIGHT_COMPARISON = 3;
    private int yearOfManufacture;
    private String model;
    private int maxSpeed;

    public Car(int n, double e, double w) {
        numberPessengers = n;
        engineCapacity = e;
        weightAvto = w;
    }

    public Car(int y, String mod, int maxSpeed) {
        yearOfManufacture = y;
        model = mod;
        maxSpeed = maxSpeed;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private String typing(double w) {
        if (w<WEIGHT_COMPARISON) {
            return "Medium";
        } else {
            return "Big";
        }
    }
}



