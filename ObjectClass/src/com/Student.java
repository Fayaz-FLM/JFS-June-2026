package com;

import java.util.Objects;

public class Student {
	
	int id;
	
	String name;
	
	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void sum(int num) {
		System.out.println(num);
	}

	String getName() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student student = (Student) obj;
		
		boolean output = (this.id == student.id) && 
		(this.name.equals(student.name));
		
		return output;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
