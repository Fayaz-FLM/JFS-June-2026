package com.wait;

public class T1 extends Thread {
	
	Object obj;
	
	public T1(Object obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		synchronized (obj) {
			System.out.println("T1 Started ...");
			System.out.println("T1 Entering waiting state");
			
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("T1 Resumed...");
		}
		
	}
	
	
	
}
