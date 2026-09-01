package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterations {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		for(int i= 0 ; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==================");
		
		for(Integer num : list) {
			System.out.println(num);
		}
		
		System.out.println("===================");
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			int num = iterator.next();
			if(num == 30) {
				iterator.remove();
			}
			System.out.println(num);
		}
		System.out.println(list);
		
		
		System.out.println("======================");
		list.add(2,30);
		
		// 10 , 20 , 30, 40 , 50
		ListIterator<Integer> iterator2 = list.listIterator();
		
		System.out.println(list);
		
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasNext());
		System.out.println(iterator2.next());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		System.out.println(iterator2.previous());
		System.out.println(iterator2.hasPrevious());
		
		System.out.println(list);
		list.add(50);
		list.add(null);
		list.add(null);
		System.out.println(list);
	}

}
