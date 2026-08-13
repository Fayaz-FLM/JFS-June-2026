package com;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Eating Biscuits...");
	}

	@Override
	public void walk() {
		System.out.println("Walking with 4 legs");
	}

}
