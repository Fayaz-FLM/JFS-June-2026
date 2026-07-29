package com;

public class Cat extends Animal{
	
	String food;
	
	String color;
	
	public Cat(String food, String color) {
		this.food = food;
		this.color = color;
	}
	
	public Cat(String food) {
		this(food,"Black");
		this.food = food;
	}
	
	public Cat() {
		this("Milk");
		System.out.println("cat object created..");
	}
	
	void sound() {
		
		System.out.println("Super age : "+ this.age);
		
		System.out.println("Age : " + this.age);
		System.out.println("Animal age : "+ super.age);
		System.out.println(this.color + " Cat sounds Meow...");
	}
	
}
