package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(13);
		list.add(6);
		list.add(1);
		list.add(19);
		list.add(16);
		list.add(10);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Integer max = Collections.max(list);
		System.out.println(max);
		
		Integer min = Collections.min(list);
		System.out.println(min);
		
		int frequency = Collections.frequency(list, 10);
		System.out.println(frequency);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0, 3);
		System.out.println(list);
		
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.replaceAll(list, 10, 15);
		System.out.println(list);
		
		
		List<Integer> list2 = List.of(10,20,30);
		System.out.println(list2);
		
		List<Integer> list3 = Arrays.asList(15, 25, 35);
		System.out.println(list3);
		
		
	}

}
