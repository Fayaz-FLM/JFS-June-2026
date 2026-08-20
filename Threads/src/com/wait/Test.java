package com.wait;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		Object obj = new Object();
		
		T1 t1 = new T1(obj);
		T2 t2 = new T2(obj);
		
		t1.start();
		
		Thread.sleep(1000);
		
		t2.start();
		
		synchronized (obj) {
			obj.wait();
			System.out.println("Main Thread..");
		}
		
	}

}
