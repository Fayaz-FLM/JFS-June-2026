package com;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("New Thread 2....");
	}

}
