package com.wait;

public class T2 extends Thread {
	
	Object obj;
	
	public T2(Object obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		synchronized (obj) {
			System.out.println("T2 Started...");
			System.out.println("T2 Notifiying All threads");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			obj.notifyAll();
		}
		
		
	}

}
