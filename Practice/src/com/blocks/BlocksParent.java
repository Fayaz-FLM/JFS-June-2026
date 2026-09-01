package com.blocks;

public class BlocksParent {
	
	public BlocksParent() {
		System.out.println("Parent Object Created");
	}
	
	static {
		System.out.println("Parent static Block");
	}
	
	{
		System.out.println("Parent instance Block");
	}

}
