package com.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferences {
	
	
	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Fayaz", new Department("Java")));
		empList.add(new Employee(2, "Ajay", new Department("Python")));
		empList.add(new Employee(3, "Rohan", new Department("Java")));
		empList.add(new Employee(4, "Krishna", new Department("Java")));
		
		
		// count of employees from all depts
		
		Map<String,Long> collect = empList
			.stream()
			.collect(Collectors.groupingBy(
					Employee::getDepartmentName,
					Collectors.counting()
					));
		
		System.out.println(collect);
			
		
		
		
		List<String> names = Arrays.asList("Fayaz", "Naveen", "Swathi","Sravanthi");
		
		
		List<Student> list = names
			.stream()
			.map(Student::new)
			.toList();
		
		System.out.println(list);
		
		
	}



	private static void methodReferences() {
		List<String> names = Arrays.asList("Fayaz", "Naveen", "Swathi","Sravanthi");
		
		// convert all names to upper case and print them
		
//		names
//		.stream()
//		.map(str -> str.toUpperCase())
//		.forEach(str -> System.out.println(str));
	
		names
		.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	
		List<Integer> nums = Arrays.asList(10, 11, 13, 17, 18, 19, 20 , 24);
		
		nums
			.stream()
			.filter(MethodReferences::isPrime)
			.forEach(System.out::println);
		
		
		String name = "FLM&*^123EDUTECH";
		
		// Print back string with only alphabets
		
		String collect = name
			.chars()
			.filter(Character::isAlphabetic)
			.mapToObj(c ->String.valueOf((char) c))
			.collect(Collectors.joining());
		
		System.out.println(collect);
	}
	
	
	
	public static boolean isPrime(int num) {
		
		for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
			
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
}
