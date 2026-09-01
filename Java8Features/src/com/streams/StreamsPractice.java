package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
	
	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(10, 10 , 15, 5 , 15 , 20);
		
		// Get distinct 
		
		List<Integer> list = nums
			.stream()
			.distinct()
			.toList();
		
		System.out.println(list);
		
		
		// Find the largest number 
		
		Integer max = nums
			.stream()
			.sorted(Comparator.reverseOrder())
			.findFirst()
			.get();
		
		System.out.println(max);
		
		// Find the second largest number
		System.out.println(nums);
		Integer secondLargest = nums
								.stream()
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst()
								.get();
		System.out.println(secondLargest);
		
		// Find the third largest number
		
		
		Integer thirdLargest = nums
								.stream()
								.sorted(Comparator.reverseOrder())
								.distinct()
								.skip(2)
								.findFirst()
								.get();
		
		System.out.println(thirdLargest);
		
		// Find first 3 largest numbers into a list
		
		List<Integer> list2 = nums
			.stream()
			.sorted(Comparator.reverseOrder())
			.distinct()
			.limit(3)
			.toList();
		System.out.println(list2);
	}

	private static void sortings() {
		List<Integer> nums = Arrays.asList(100,10,2,12,30);
		
		
		List<Integer> list = nums
								.stream()
								.sorted()
								.toList();
		
		
		System.out.println(list);
		
		List<Integer> list2 = nums
								.stream()
								.sorted(Comparator.reverseOrder())
								.toList();
		
		System.out.println(list2);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, "Pavan", 10000));
		empList.add(new Employee(2, "Hema", 17000));
		empList.add(new Employee(3, "Fayaz", 12000));
		empList.add(new Employee(4, "Devi", 15000));
		
		List<Employee> list3 = empList
								.stream()
								.sorted( (emp1 , emp2) -> Integer.compare(emp1.salary , emp2.salary))
								.toList();
		
		System.out.println(list3);
	}

	private static void filters() {
		List<Integer> nums = Arrays.asList(10,15,20,25,30);
		
		Stream<Integer> stream = nums.stream();
		
		stream.forEach(num -> System.out.println(num));
		
		System.out.println("---------------------");
		// Print Odd numbers from a list
		
		nums
			.stream()
			.filter( num -> num % 2 != 0 )
			.forEach(num -> System.out.println(num));
		
		List<Integer> evenNumbers = nums
										.stream()
										.filter(num -> num % 2 == 0)
										.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		
		List<Integer> list = nums
			.stream()
			.filter(num -> num > 15)
			.toList();
		
		System.out.println(list);
	}

}
