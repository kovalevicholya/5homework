package com.pvt.carlib;

public class ElectricCar extends Vehicle {

    public ElectricCar(int wheelCount, int axisCount, int seatCount, int weight, Engine engine) throws Exception {
        super(wheelCount, axisCount, seatCount, weight, engine);
    }

    @Override
    public boolean on() {
        super.on();
        System.out.println("Activate brakes system");
        System.out.println("ElectricCar started");
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public boolean upSpeed(int powerPercent) {
        return false;
    }

    @Override
    public boolean downSpeed(int powerPercent) {
        return false;
    }
}
