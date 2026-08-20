package com;

import java.util.ArrayList;

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
		li.add(1,30);
		System.out.println(li);
		System.out.println("=========");
	 	Student student =  (Student) li.get(6);
		System.out.println(student.getName());
		
		System.out.println("----------------------");
		
		ArrayList<Integer> li2 = new ArrayList<>();
		li2.add(15);
		li2.add(25);
	}

}
