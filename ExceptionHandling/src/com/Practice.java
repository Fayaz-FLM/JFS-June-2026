package com;

import java.io.FileInputStream;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in) ;
			FileInputStream fis = new FileInputStream("D//FLM/Hi.txt")	) {
			
			System.out.println("Enter a num");
			int num = sc.nextInt();
			System.out.println(num/0);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
