package com.pvt.carlib;

public class PetroEngine extends Engine{
    private double petroFuelConsume=15; //л*100км
    @Override
    public boolean on() {
        System.out.println("PetroEngine on");
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public boolean changePower(int powerPercent) {
        return false;
    }

    @Override
    public double consumption() {
        petroFuelConsume=10+(Math.random()*10);
        return petroFuelConsume;
    }
}

