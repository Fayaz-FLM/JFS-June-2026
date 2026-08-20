package com.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Integer> calculator = new Calculator2();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Future<Integer> future = executorService.submit(calculator);
		
		Integer num = future.get();
		System.out.println(future.isDone());
		System.out.println(num);
		System.out.println(num * 2);
		System.out.println(num / 3);
		
		executorService.shutdown();
		
	}

}
