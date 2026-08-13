package com;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args){
		
		File file = new File("D://Files/Bye.txt");
		
		try {
			file.createNewFile();
			System.out.println("Created a new file....");
		}
		catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
		
	}

}
