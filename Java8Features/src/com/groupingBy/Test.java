package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Ruchitha", 30000, new Department(1, "Java"));
		Employee emp2 = new Employee(2, "Rohan", 20000, new Department(2, "Python"));
		Employee emp3 = new Employee(3, "Fayaz", 20000, new Department(3, "Java"));
		Employee emp4 = new Employee(4, "Tejaswini", 30000, new Department(4, "DataBase"));
		Employee emp5 = new Employee(5, "Lakhsmi", 10000, new Department(5, "Python"));
		Employee emp6 = new Employee(6, "Krishna", 10000, new Department(6, "Java"));
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		// Return all employees grouped by their departments
		
		Map<String,List<Employee>> collect = empList
			.stream()
			.collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName()));
		
		collect
			.entrySet()
			.forEach(e -> System.out.println(e.getKey() + " = "+ e.getValue()));
		
		
		// Return the count of employees in each dept
		
		Map<String,Long> collect2 = empList
			.stream()
			.collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(), Collectors.counting()));
		
		System.out.println(collect2);
		
		// Average salary of employees of each dept
		
		Map<String,Double> collect3 = empList
			.stream()
			.collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(), 
					Collectors.averagingDouble(emp -> emp.getSalary())));
		
		System.out.println(collect3);
	}

}
