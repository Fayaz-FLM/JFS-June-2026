package com.callable;

public class Calculator implements Runnable{

	@Override
	public void run() {
		int a = 10;
		int b = 20;
		int c = a+ b;
		System.out.println(c);
	}

}
