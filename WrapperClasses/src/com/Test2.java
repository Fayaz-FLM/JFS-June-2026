package com;

public class Test2 {
	
	static Integer b;
	static int c;
	
	public static void main(String[] args) {
		
		String s = "123";
		
		int num = Integer.parseInt(s);
		System.out.println(num + 1);
		
		String s2 = "100";
		int num2 = Integer.parseInt(s2);
		System.out.println(num2);
		
		int a = 150;
		String num3 = String.valueOf(a);
		System.out.println(a + 1);
		System.out.println(num3 + 1);
		
		Character c1 = 'A';
		
		System.out.println(Character.isLetter(c1));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isDigit('2'));
		System.out.println(Character.isDigit('B'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('N'));
		
		System.out.println(Test2.b);
		System.out.println(Test2.c);
	}

}
