package com;

public class Employee {
	
	int employeeId;
	
	String name;
	
	int age;
	
	double salary;
	
	static String companyName = "FLM";
	
	public Employee(int empId, String empName, int empAge, double empSalary, String empCompany) {
		
		employeeId = empId;
		name = empName;
		age = empAge;
		salary = empSalary;
		companyName = empCompany;
	}
	
	public Employee() {
		
	}
}
