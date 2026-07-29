package com;

public class Test {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		System.out.println(p.a);
		p.m1();
		
		Child c = new Child();
		
		System.out.println(c.b);
		c.m2();
		
		System.out.println("==============");
		
		System.out.println(c.a);
		c.m1();
		
		System.out.println("============");
		
		System.out.println(c.a);
		System.out.println(p.a);
		
		System.out.println("===============");
		
		p.m1();
		c.m1();
	}

}
