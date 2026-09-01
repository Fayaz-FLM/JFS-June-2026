package com.anonymous;

public class Bike implements Vehicle{
	
	@Override
	public void noOfWheels() {
		System.out.println("2 Wheels...");
	}

	public void stop() {
		System.out.println("Stopping bike..");
	}
}
