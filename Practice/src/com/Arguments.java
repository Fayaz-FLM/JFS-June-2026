package com;

public class Arguments {
	
	public static void main(String... args) {
		
		sum(10,20);
		sum(10, 20 , 30);
		sum(10,20,30,40);
		sum(10,10,10,10,10);
	}
	
	
	static void sum(int... nums) {
		int sum=0;
		for(int num : nums) {
			sum += num;
		}
		System.out.println(sum);
	}

}
