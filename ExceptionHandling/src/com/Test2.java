package com;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		int res = divide();
		System.out.println(res);
	}

	static int divide() {
		
		try {
			int num1 = 20;
			int num2 = 0;
			
			int res = num1 / num2;
			return res;
		}
		catch(ArithmeticException ex) {
			System.out.println("Dont divide by 0");
			return 1;
		}
		finally {
			return 5;
		}
	}
}
