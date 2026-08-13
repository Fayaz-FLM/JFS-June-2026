package com.interfaces;

public class Jio implements Trai{

	@Override
	public void calling() {
		System.out.println("Freeeeee...");
	}

	@Override
	public void data() {
		System.out.println("5G Data");
	}

	@Override
	public void sms() {
		System.out.println("100 SMS Per Day");
	}
	
	public void roaming() {
		System.out.println("Internarional Roaming....");
	}
	
	public void ott() {
		System.out.println("Hotstar..");
	}

	@Override
	public void rcsSms() {
		
	}
}
