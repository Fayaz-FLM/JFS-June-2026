package com.def;

public class Benz implements Car{

	@Override
	public void start() {
		System.out.println("Starting Benz...");
	}
	
	@Override
	public void airBags() {
		System.out.println("6 Air Bags..");
	}
	
}
