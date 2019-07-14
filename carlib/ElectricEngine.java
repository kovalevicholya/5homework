package com.pvt.carlib;

public class ElectricEngine extends Engine{
    private double elPowerConsume=50; //кв*час
    @Override
    public boolean on() {
        System.out.println("ElectricEngine on");
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
        elPowerConsume=45+(Math.random()*10);
        return elPowerConsume;
    }

}
