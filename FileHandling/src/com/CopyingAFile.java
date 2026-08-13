package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingAFile {
	
	public static void main(String[] args) {
		
		File file = new File("D://Files/Java-Full-Stack.png");
		File file2 = new File("D://Files/new2.png");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			int temp;
			while((temp = fis.read()) != -1) {
				fos.write(temp);
			}
			System.out.println("Copied files...");
			
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
