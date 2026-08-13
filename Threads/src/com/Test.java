package com;

public class Test {
	
	public static void main(String[] args) {
		
//		System.out.println("-----> " + Thread.currentThread().getName());
		
//		System.out.println("Byee..");
//		System.out.println("Bye 2");
		
		
		MyThread t1 = new MyThread();
		t1.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Bye...");
		}
	}

}
