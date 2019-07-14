package com.pvt.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    ElectricEngine electricEngine = new ElectricEngine();
	    Vehicle electroVehicle = new ElectricCar(4,2,5,1500, electricEngine);

	    PetroEngine petroEngine = new PetroEngine();
        Vehicle petroVehicle = new PetroCar(6,3,10,3000, petroEngine);

        System.out.println("Is electroVehicle on = " + electroVehicle.on());
        System.out.println("Power consumption = " + electricEngine.consumption() + "  kwt per hour");
        System.out.println("Is petroVehicle on = " + petroVehicle.on());
        System.out.println("Gas consumption = " + petroEngine.consumption() + "  litres per 100 km");

    }
}
