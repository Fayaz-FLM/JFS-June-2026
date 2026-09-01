package com.lambda;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("My Thread Started...");
	}

}
