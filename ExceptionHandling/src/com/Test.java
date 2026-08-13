package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			
			System.out.println("Enter Number 1");
			
			int num1 = sc.nextInt();
			
			System.out.println("Enter Number 2");
			
			int num2 = sc.nextInt();
			System.out.println("Hiii..");
			
			System.out.println(num1/num2);
			
			System.out.println("Hiii2");
		}
		catch(InputMismatchException ex) {
			System.out.println("Only Integer Numbers Allowed!!!");
		}
		catch(ArithmeticException ex) {
			System.out.println("Dont divide by 0!!!");
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index Out Of Bound");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Entered Finally");
			sc.close();
		}
		System.out.println("Byee....");
		System.out.println("Good Bye...");
		
	}
	
	
}
