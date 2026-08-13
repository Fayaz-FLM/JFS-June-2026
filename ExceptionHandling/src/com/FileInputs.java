package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputs {
	
	
	public static void main(String[] args) {
		try {
			
			FileInputs.readFile();
		}
		catch(FileNotFoundException ex) {
			System.out.println("File Not FOund");
		}
		
	}
	
	static void readFile() throws FileNotFoundException {
		
		File file = new File("D://JFS-June2026/Hiiii.txt");
		FileInputStream fis = new FileInputStream(file);
	
	}
}
