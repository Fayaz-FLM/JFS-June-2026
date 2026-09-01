package com.anonymous;

public class Test2 {

	public static void main(String[] args) {
		
		Vehicle lorry = () -> { System.out.println("8 wheels"); };
		
		lorry.noOfWheels();
		lorry.start();
	}
}
