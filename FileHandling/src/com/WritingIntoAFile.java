package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoAFile {
	
	public static void main(String[] args) {
		
		File file = new File("D://Files/Hi.txt");
		FileOutputStream fos = null;
		try {
			
			fos = new FileOutputStream(file);
			
			String data = "Fayaz Class is too boring";
			fos.write(data.getBytes());
			System.out.println("Successfully Written into a file..");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
