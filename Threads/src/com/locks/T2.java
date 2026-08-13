package com.locks;

public class T2 extends Thread{
	
	T1 t1;
	
	@Override
	public void run() {
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread 2...");
	}
	
}
