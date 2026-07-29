package com.inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		FuelCar fc = new FuelCar();
		
		System.out.println(fc.fuelCapacity);
		System.out.println(fc.numOfWheels);
		System.out.println(fc.price);
		fc.start();
		fc.drive();
		fc.fillFuel();
		
		
		EVCar ev =  new EVCar();
		ev.chargeBattery();
		ev.drive();
		ev.start();
	}

}
