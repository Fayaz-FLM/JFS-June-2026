package com.methods;

public class Counter {
	
	int count = 0;
	
	public synchronized void increment() {
		
		this.count++;
	}
}
