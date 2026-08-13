package com;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setName("Fayaz Thread");
		System.out.println(Thread.currentThread().getName());
		for(int i = 1; i<=20; i++) {
			System.out.println("Hiii..");
		}
	}
}
