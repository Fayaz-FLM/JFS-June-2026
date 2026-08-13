package com.methods;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Thread1 t1 = new Thread1(counter);
		
		Thread t2 = new Thread2(counter);
		
		t1.start();
		t2.start();
		
//		t1.join();
//		t2.join();
		
		System.out.println("Count Value : "+ counter.count);
		
	}

}
