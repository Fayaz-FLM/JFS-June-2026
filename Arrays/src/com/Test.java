package com;

public class Test {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Fayaz", "Java", 1000);
		Employee emp2 = new Employee(2, "Lakshmi", "Java Script", 3000);
		Employee emp3 = new Employee(3, "Mani", "Python", 4000);
		
		Employee[] employees = new Employee[5];
		
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp3;
		employees[4] = emp2;
		
		for(Employee emp : employees) {
			System.out.println(emp.getName());
		}
 		
	}

}
