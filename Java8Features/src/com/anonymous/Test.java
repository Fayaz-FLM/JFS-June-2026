package com.anonymous;

public class Test {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.noOfWheels();
		
		
		// Anonymous Inner Class
		Vehicle car = new Vehicle() {
			
			@Override
			public void noOfWheels() {
				System.out.println("4 wheels");
			}

		};
		
		car.noOfWheels();
		bike.stop();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
