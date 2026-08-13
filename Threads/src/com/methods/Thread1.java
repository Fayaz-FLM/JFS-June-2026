package com.methods;

public class Thread1 extends Thread{
	
	Counter counter;
	
	public Thread1(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000 ; i++) {
			
			try {
				Thread.sleep(1);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			
			counter.increment();
		}
	}
	
}
