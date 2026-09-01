package com.def;

public class C implements A, B{
	
	@Override
	public void m1() {
		
		A.super.m1();
		B.super.m1();
		
	}

}
