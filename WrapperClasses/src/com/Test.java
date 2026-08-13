package com;

public class Test {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		Integer b = new Integer(15);
		Integer c = Integer.valueOf(15);
		System.out.println(c);
		
		
		// Auto Boxing
		Integer d = Integer.valueOf(a);
		System.out.println(d);
		
		
		// Auto UnBoxing
		Integer e = Integer.valueOf(20);
		int f = e.intValue();
		System.out.println(f);
		
		Integer g = 20;
		Integer h = a;
		
		int i = g;
		
	}

}
