package com.executors;

public class T1 extends Thread{
	
	@Override
	public void run() {
		for(int i=1; i<=15; i++) {
			System.out.println("T1 running..");
		}
	}
	

}
