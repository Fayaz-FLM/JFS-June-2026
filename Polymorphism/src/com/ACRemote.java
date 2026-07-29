package com;

public class ACRemote extends Remote{
	
	int temp = 18;
	
	public void increaseTemp() {
		this.temp++;
		System.out.println("Current temp : "+ this.temp);
	}
	
	@Override
	public void turnOn() {
		System.out.println("Tunring on AC...");
	}

}
