package com.def;

@FunctionalInterface
public interface Car {
	
	void start();
	
	default void airBags() {
		System.out.println("2 airbags...");
	}
	
	static void headLight() {
		System.out.println("Headlight turned on..");
	}
}
