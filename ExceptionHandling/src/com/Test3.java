package com;

public class Test3 {
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 0;
		
		if(num2 == 0) {
			throw new ArithmeticException();
		}
		
		int res = num1 / num2;
		System.out.println(res);
		
	}

}
