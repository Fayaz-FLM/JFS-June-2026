package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Dasu" , 20000));
		empList.add(new Employee(2, "Fayaz", 25000));
		empList.add(new Employee(3, "Lakshmi", 22000));
		empList.add(new Employee(4, "Rohan", 24000));
		
		Collections.sort(empList, (emp1, emp2) ->  emp1.salary - emp2.salary);
		
		System.out.println(empList);
		
		Collections.sort(empList, (emp1, emp2) -> emp2.empId - emp1.empId);
		System.out.println(empList);
	}
}
