package com;

public class Engine {
	
	String fuelType;
	
	int capacity;

	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

	public Engine(String fuelType, int capacity) {
		super();
		this.fuelType = fuelType;
		this.capacity = capacity;
	}

	public Engine() {
		super();
	}
	
}
