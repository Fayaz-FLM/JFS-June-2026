package com.def;

public interface B {
	
	default void m1() {
		System.out.println("From Interface B..");
	}
	
	static void m2() {
		System.out.println("From Static B..");
	}

}
