package com;

public class Airtel implements Sim{
	
	int a = 19;
	int b = 30;

	@Override
	public void calling() {
		System.out.println("Unlimited Calling");
	}
	
	public void data() {
		System.out.println("5g");
	}

}
