package com;

import java.util.ArrayList;
import java.util.List;

public class ListsPractice {
	
	public static void main(String[] args) {
		
		Student st = new Student(1,"Fayaz",19);
		
		ArrayList li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(15.5);
		li.add("FLM");
		li.add(true);
		li.add('A');
		li.add(st);
		li.add(10);
		System.out.println(li);
		System.out.println(li.get(1));
		System.out.println("=========");
		System.out.println(li);
		System.out.println(li);
		System.out.println("=========");
	 	Student student =  (Student) li.get(6);
		System.out.println(student.getName());
		
		System.out.println("----------------------");
		
		ArrayList<Integer> li2 = new ArrayList<>();
		li2.add(15);
		li2.add(25);
		
		
		System.out.println("========================");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		System.out.println(list.size());
		list.add(1,15);
		System.out.println(list);
		System.out.println(list.size());
		list.set(1, 18);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("===========");
		System.out.println(list.contains(20));
		System.out.println(list.contains(25));
		
		list.add(20);
		System.out.println(list);
		System.out.println(list.indexOf(20));
		System.out.println(list.lastIndexOf(20));
		
		System.out.println(list.isEmpty());
		
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println(list2.isEmpty());
		list2.addAll(list);
		System.out.println(list2);
		list2.add(15);
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		list2.clear();
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		System.out.println(list2.indexOf(10));
		
	}

}
