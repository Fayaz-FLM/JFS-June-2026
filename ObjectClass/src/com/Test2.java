package com;

public class Test2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address adr1 = new Address(12345, "Hyderabad");
		Employee emp1 = new Employee(1, "Ruchitha", 40000, adr1);
		
		System.out.println(emp1);
		
		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2);
		
		emp1.setEmpId(2);
		emp1.setName("Nagendra");
		emp1.getAddress().setCity("Banglore");
		System.out.println("=====================");
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
