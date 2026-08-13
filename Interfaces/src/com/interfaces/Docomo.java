package com.interfaces;

public class Docomo implements Trai{

	@Override
	public void calling() {
		System.out.println("1rs/1min");
	}

	@Override
	public void data() {
		System.out.println("2G Data");
	}

	@Override
	public void sms() {
		System.out.println("100 sms per month");
	}

	@Override
	public void rcsSms() {
		
	}
	
}
