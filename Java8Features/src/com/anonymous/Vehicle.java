package com.anonymous;

@FunctionalInterface
public interface Vehicle {
	
	void noOfWheels();
	
	default void start() {
		System.out.println("Starting method..");
	}
	
}
