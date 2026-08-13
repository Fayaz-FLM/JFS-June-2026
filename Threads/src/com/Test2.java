package com;

public class Test2 {
	
	public static void main(String[] args) {
		
		Runnable t2 = new MyThread2();

		Thread thread = new Thread(t2);
		thread.start();
		
	}

}
