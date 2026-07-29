package com;

public class Test {
	
	int x;
	
	static int y = 20;
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.employeeId = 1;
		emp1.name = "fayaz";
		emp1.salary = 10000;
		emp1.age = 20;
		
		Employee emp2 = new Employee();
		emp2.employeeId = 2;
		emp2.name = "Rohan";
		emp2.salary = 90000;
		emp2.age = 25;
		
		System.out.println("Employee 1 Details ===============");
		System.out.println(emp1.name);
		System.out.println(emp1.companyName);
		
		System.out.println("Employee 2 Details ===============");
		System.out.println(emp2.name);
		System.out.println(emp2.companyName);
		
		emp1.name= "Fayaz S";
		
		System.out.println("Employee 1 Details ===============");
		System.out.println(emp1.name);
		System.out.println(emp1.companyName);
		
		System.out.println("Employee 2 Details ===============");
		System.out.println(emp2.name);
		System.out.println(emp2.companyName);
		
		Employee.companyName = "XXXX";
		
		System.out.println("Employee 1 Details ===============");
		System.out.println(emp1.name);
		System.out.println(emp1.companyName);
		
		System.out.println("Employee 2 Details ===============");
		System.out.println(emp2.name);
		System.out.println(emp2.companyName);
		
		Test t = new Test();
		t.sum();
	}
	
	void sum() {
		
		System.out.println(x);
		int a=10;
		System.out.println(a);
		
	}
	
}
