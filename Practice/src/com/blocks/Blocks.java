package com.blocks;

public class Blocks extends BlocksParent{
	
	Blocks(){
		System.out.println("Child Object Created");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main..");
		Blocks block = new Blocks();
		
	}
	
	static {
		System.out.println("Child Static Block");
	}
	
	{
		System.out.println("Child Instance Block");
	}
}
