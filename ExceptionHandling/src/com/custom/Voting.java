package com.custom;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("Eligible To Vote");
		}
		else {
			throw new InvalidAgeException("Age Below 18");
		}
		
	}

}
