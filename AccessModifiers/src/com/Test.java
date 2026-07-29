package com;

public class Test {
	
	public int a;
	
	private int b;
	
	protected int c;
	
	int d;
	
	public Test() {
		
	}
	
	private Test(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	protected Test(int a) {
		this.a = a;
	}
	
	Test(String input){
		
	}
	
	public void hi() {
		System.out.println("Hi....");
	}
	
	private void party() {
		System.out.println("Private party...");
	}
	
	protected void bye() {
		System.out.println("Protected Method..");
	}
	
	void dummy() {
		System.out.println("Dummy...");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(10, 5);
		
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
		t.hi();
		t.party();
		t.bye();
		t.dummy();
	}
}
