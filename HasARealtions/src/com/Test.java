package com;

public class Test {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.brand = "Tata";
		car.model = "Punch";
		car.price = 8000000;
		
		Engine engine = new Engine();
		engine.capacity = 1200;
		engine.fuelType = "Petrol";
		
		car.engine = engine;
		
		System.out.println(car.model);
		System.out.println(car.brand);
		System.out.println(car.price);
		System.out.println(car.engine.capacity);
		System.out.println(car.engine.fuelType);
		
		
		System.out.println("======================");
		
		Engine engine2 = new Engine("Diesel", 1500);
		Car car2 = new Car("Toyato","Innova",4000000, engine2);
		System.out.println(car2);
		
		System.out.println("=========================");
		
		Car car3 = new Car("Kia","Sonet", 900000, new Engine("CNG", 1200));
		System.out.println(car3.engine.fuelType);
		
	}

}
