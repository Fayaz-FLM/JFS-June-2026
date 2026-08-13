package com.interfaces;

public class Airtel implements Trai {

	@Override
	public void calling() {
		System.out.println("100 rs 100 calls");
	}

	@Override
	public void data() {
		System.out.println("3G Data");
	}

	@Override
	public void sms() {
		System.out.println("50 SMS Per day");
	}
	
	public void AI() {
		System.out.println("Perplexity pro..");
	}

	@Override
	public void rcsSms() {
		
	}

}
