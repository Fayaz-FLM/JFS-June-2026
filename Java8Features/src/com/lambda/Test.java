package com.lambda;

public class Test {
	
	public static void main(String[] args) {
		
		Runnable myThread = new MyThread();
		
		Thread t1 = new Thread(myThread);
		t1.start();
		
		
		Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		t2.start();
		
		
		
		Calculator calc =  (a , b) -> {
			System.out.println("Starting sum...");
			int sum = a+b;
			return sum;
		};
		
		int sum = calc.sum(20, 20);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
