package com;

public class Test {
	
	public static void main(String[] args) {
		
		TVRemote tv = new TVRemote();
		
		tv.turnOn();
		tv.increaseVolume();
		
		ACRemote ac = new ACRemote();
				
		ac.turnOn();
		ac.increaseTemp();
		
	}
}
