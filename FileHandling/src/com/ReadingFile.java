package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {
	
	public static void main(String[] args) {
		
		File file = new File("D://Files/Bye.txt");
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			int temp;
			
			while((temp = fis.read()) != -1) {
				System.out.print((char) temp);
			}
			
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
