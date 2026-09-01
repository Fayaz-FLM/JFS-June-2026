package com;

import java.util.LinkedList;

public class LinkedListsMethods {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.addFirst(5);
		list.addLast(35);
		System.out.println(list);
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		
	}
}
