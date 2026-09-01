package com.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterations {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,15,20,25,30);
		
		System.out.println("===================");
		for(int i = 0 ; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		System.out.println("======================");
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		System.out.println("=======================");
		
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("==========================");
		
		// Java 8 - forEach
		
		nums.forEach(num -> System.out.println(num));
		
		
	}

}
