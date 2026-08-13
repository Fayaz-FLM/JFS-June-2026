package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	
	public static void main(String[] args) {
		
		File file = new File("D://Files/Hi.txt");
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int temp;
			
			while((temp = fr.read()) != -1) {
				System.out.print((char) temp);
			}
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void write() {
		File file = new File("D://Files/Hi2.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			fw.write("Hi Guys...");
			
			System.out.println("Saved into a file");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
