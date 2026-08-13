package com;

public class Cat extends Animal{
	
	@Override
	void sound() {
		System.out.println("Meowwww...");
	}

	@Override
	void food() {
		System.out.println("Milk");
	}

}
