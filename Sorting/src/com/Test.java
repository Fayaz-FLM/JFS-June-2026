package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "Priya", 100));
		studentList.add(new Student(2, "Ambareesh", 75));
		studentList.add(new Student(3, "Phani", 99));
		
		System.out.println(studentList);
		
		Collections.sort(studentList, new IdComparator());
		
		System.out.println(studentList);
		
		Collections.sort(studentList, new MarksComparator());
		System.out.println(studentList);
		
	}

}
