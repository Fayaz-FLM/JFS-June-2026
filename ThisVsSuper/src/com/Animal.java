package com;

public class Animal {
	
	String name;
	
	int noOfLegs;
	
	int age = 15;
	
	public Animal(String name, int noOfLegs, int age) {
		this.name = name;
		this.noOfLegs = noOfLegs;
		this.age = age;
	}
	
	public Animal() {
		System.out.println("Animal Object Created");
	}
	
	void print() {
		
		System.out.println(this.name);
		System.out.println(this.noOfLegs);
		System.out.println(this.age);
		
	}
	
}
