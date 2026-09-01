package com.def;

public interface A {
	
	default void m1() {
		System.out.println("From Interface A..");
	}
	
	static void m2() {
		System.out.println("From Static A..");
	}

}
