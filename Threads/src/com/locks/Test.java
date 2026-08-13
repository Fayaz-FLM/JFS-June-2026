package com.locks;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.t2 = t2;
		t2.t1 = t1;
		
		t1.start();
		t2.start();
		
		System.out.println("Main..");
	}

}
