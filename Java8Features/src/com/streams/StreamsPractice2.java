package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamsPractice2 {
	
	 public static void main(String[] args) {
		 

		 groupingByFunctuions();
	}

	 private static void groupingByFunctuions() {
		String langauge = "JAVA";
		 
		 Map<Character,Long> collect = langauge
		 	.chars()
		 	.mapToObj(c -> (char) c)
		 	.collect(Collectors.groupingBy(c -> c , Collectors.counting()));
		 
		 System.out.println(collect);
		 
		 
		 String names = "Fayaz Shanmuk Fayaz Sai Sai Sai";
		 
		 Map<String,Long> collect2 = Arrays.stream(names.split(" "))
		  		.collect(Collectors.groupingBy(str -> str, Collectors.counting()));
		 
		 System.out.println(collect2);
		 
		 
		 
		 
		 String company = "FRONTLINES";
		 
		 Map<Character,Long> collect3 = company
		 	.chars()
		 	.mapToObj(c -> (char) c)
		 	.collect(Collectors.groupingBy(c -> c, () -> new TreeMap<>()  , Collectors.counting()));
		 
		 System.out.println(collect3);
	 }

	 private static void joiningOperations() {
		String name = "FRONTLINESEDUTECH";
		 
		 List<Character> list = name
							 	.chars()
							 	.mapToObj(c -> (char) c)
							 	.toList();
		 
		 System.out.println(list);
		 
		 // Remove duplicates 
		 
		 List<Character> list2 = name
		 	.chars()
		 	.distinct()
		 	.mapToObj(c -> (char) c)
		 	.toList();
		 
		 System.out.println(list2);
		 
		 
		 // "F" , "R" , "O"
		 // "FRO"
		 String collect = name
		 	.chars()
		 	.distinct()
		 	.mapToObj(c -> String.valueOf((char) c))
		 	.collect(Collectors.joining());
		 System.out.println(name);
		 System.out.println(collect);
		 
		 // FRONTLINESEDUTECH
		 // F,R,O,N,T,L,I,N,E,S,E,D,U,T,E,C,H
		 
		 // F  R
		 // F,R,O
		 String collect2 = name
		 	.chars()
		 	.mapToObj(c -> String.valueOf((char) c))
		 	.collect(Collectors.joining("-"));
		 System.out.println(collect2);
		 
		 String name2 = "FRONT LINES EDUTECH";
		 
		 String collect3 = name2
		 	.chars()
		 	.filter(c -> c!= ' ')
		 	.mapToObj(c -> String.valueOf((char) c))
		 	.collect(Collectors.joining("-"));
		 System.out.println(collect3);
		 
		 
		 // FRONT
		 // [F,R,O,N,T]
		 String name3 = "FRONT";
		 String collect4 = name3
		 	.chars()
		 	.mapToObj(c -> String.valueOf((char) c))
		 	.collect(Collectors.joining("," , "[" , "]"));
		 
		 System.out.println(collect4);
		 
		 
		 
		 String name5 = "FRONT LINES EDUTECH";
		 
		 // FRONT-LINES-EDUTECH
		 
		 String[] split = name5.split(" ");
		 
		 String collect5 = Arrays.stream(split)
		 	.collect(Collectors.joining("-"));
		 
		 System.out.println(collect5);
		 
		 
		 
		 String name6 = "Java Is a Very Very Difficult Language";
		 
		// Java-Is-a-Very-Difficult
		 
		 
		 String[] split2 = name6.split(" ");
		 
		 String collect6 = Arrays.stream(split2)
		 	.distinct()
		 	.collect(Collectors.joining("-"));
		 
		 System.out.println(collect6);
		 
		 // JIaVVDL
		 
		 String[] split3 = name6.split(" ");
		 
		 String collect7 = Arrays.stream(split3)
		 	.map(str -> String.valueOf(str.charAt(0)))
		 	.collect(Collectors.joining());
		 
		 System.out.println(collect7);
	 }

	 private static void reduceOperatiosn() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		 
		 int sum = 0;
		 for(int num : nums) {
			 sum = sum + num;
		 }
		 System.out.println(sum);
		 
		 // 0 + 10 = 10
		 // 10 + 20 = 30
		 // 30 + 30 = 60
		 // 60 + 40 = 100
		 Integer sum2 = nums
		 	.stream()
		 	.reduce(0, (a,b) -> a+b);
		 System.out.println(sum2);
		 
		 // 1 * 1 = 1
		 // 1 * 2 = 2
		 // 2 * 3 = 6
		 // 6 * 4 = 24
		 Integer product = nums
		 	.stream()
		 	.reduce(1, (a,b) -> a*b);
		 System.out.println(product);
		 
		 
		 List<String> name = Arrays.asList("Front", "Lines", "Edutech");
		 // Front Lines Edutech
		 
		 // ""  + " " + "Front" = "Front"
		 String company = name
		 	.stream()
		 	.reduce("" , (a,b) -> a + " " + b)
		 	.trim();
		 System.out.println(company);
	 }

	 private static void parallelStreams() {
		List<String> names = Arrays.asList("FLM", "Java", "Full", "Stack", "June", "2026");
		 
		 names
		 	.parallelStream()
		 	.forEach(name -> System.out.println(name));
	 }

	 private static void partioning() {
		List<Integer> nums = Arrays.asList(10, 21, 34, 55, 60, 73);
		 
		 List<Integer> even = nums
		 	.stream()
		 	.filter(n -> n % 2 == 0)
		 	.toList();
		 System.out.println(even);
		 
		 List<Integer> odd = nums
		 	.stream()
		 	.filter(n -> n% 2 !=0)
		 	.toList();
		 System.out.println(odd);
		 
		 Map<Boolean,List<Integer>> collect = nums
		 	.stream()
		 	.collect(Collectors.partitioningBy(n -> n% 2 ==0));
		 
		 System.out.println(collect);
		 
		 Map<Boolean,List<Integer>> collect2 = nums
		 	.stream()
		 	.collect(Collectors.partitioningBy(n -> n>25));
		 
		 System.out.println(collect2);
	 }

	 private static void flatMaps() {
		List<List<String>> words = new ArrayList<List<String>>();
		 
		 
		 words.add(Arrays.asList("Hi", "Bye"));
		 words.add(Arrays.asList("Fayaz", "Java"));
		 words.add(Arrays.asList("Python", "Boring"));
		 words.add(Arrays.asList("Paris", "Budget", "high"));
		 
		 System.out.println(words);
		 
		 
		 List<String> flattenedList = words
		 	.stream()
		 	.flatMap(list -> list.stream())
		 	.toList();
		 
		System.out.println(flattenedList);
	 }

	 private static void matches() {
		List<Integer> nums = Arrays.asList(10, 20, 25, 30, 35 , 40);
		 
		 boolean allMatch = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.allMatch(n -> n% 5 == 0);
		 
		 System.out.println(allMatch);
		 
		 boolean anyMatch = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.anyMatch(n -> n % 8 == 0);
		 
		 System.out.println(anyMatch);
	 }

	 private static void aggregateFunctions() {
		List<Integer> nums = Arrays.asList(10, 24 , 30, 60, 15, 17);
		 
		 
		 int sum = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.sum();
		 
		 System.out.println(sum);
		 	
		
		 int max = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.max()
		 	.getAsInt();
		 System.out.println(max);
		 
		 int min = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.min()
		 	.getAsInt();
		 
		 System.out.println(min);
		 
		 
		 
		 double average = nums
		 	.stream()
		 	.mapToInt(n -> n)
		 	.average()
		 	.getAsDouble();
		 
		 
		 System.out.println(average);
		 
		 
		 // find number of factors of 6
		 
		 
		 long count = nums
		 	.stream()
		 	.filter(n -> n % 6 == 0 )
		 	.count();
		 
		 System.out.println(count);
	 }

	 private static void hashMapOperations() {
		Map<String, String> names = new HashMap<String, String>();
		 
		 names.put("Fayaz", "Hyderabad");
		 names.put("Naresh", "Banglore");
		 names.put("Dasu", "Chennai");
		 names.put("Sandeep", "Noida");
		 names.put("Imam", "Hyderabad");
		 names.put("Akhila", "Hyderabad");
		 
		 names
		 	.entrySet()
		 	.stream()
		 	.filter(e -> e.getValue().equals("Hyderabad"))
		 	.forEach(e -> System.out.println(e.getKey() + " = "+ e.getValue()));
		
		 Set<String> cities = names
		 	.entrySet()
		 	.stream()
		 	.map(e -> e.getValue())
		 	.collect(Collectors.toSet());
		 
		 System.out.println(cities);
		 
		 names
		 	.keySet()
		 	.stream()
		 	.forEach(key -> System.out.println(key));
		 
		 names
		 	.values()
		 	.stream()
		 	.forEach(val -> System.out.println(val));
		 
		 
		 Map<String,String> map = names
		 	.entrySet()
		 	.stream()
		 	.filter(e -> e.getValue().equals("Hyderabad"))
		 	.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		 
		 System.out.println(map);
	 }

	 private static void mapOperations() {
		List<Integer> nums = Arrays.asList(11,19,26,4,77,6);
		 
		 // all values should be doubled
		 
		 // map
		 
		 List<Integer> list = nums
		 	.stream()
		 	.map(n -> n * 2)
		 	.toList();
		 
		 System.out.println(list);
		 
		 // Given a list of numbers , increment all values by 4,
		 // and return highest 2 values in a list which are multiples of 5
		 
		 // map , filter , skip, , sorted, limit, tolist
		 
		 List<Integer> list2 = nums
		 	.stream()
		 	.map(n -> n + 4)
		 	.filter(n -> n % 5 == 0)
		 	.sorted(Comparator.reverseOrder())
		 	.limit(2)
		 	.toList();
		 
		 System.out.println(list2);
		 
		List<Employee> empList = new ArrayList<Employee>();
			
		empList.add(new Employee(1, "Pavan", 10000));
		empList.add(new Employee(2, "Hema", 17000));
		empList.add(new Employee(3, "Fayaz", 12000));
		empList.add(new Employee(4, "Devi", 15000));
		
		empList
			.stream()
			.map(emp -> emp.getEmpName())
			.toList();
		
		// increase salary by 2000 and get employee objects into List
		
		empList
			.stream()
			.map(emp -> new Employee(emp.getEmpId() ,emp.getEmpName(), emp.getSalary() + 2000))
			.forEach(emp -> System.out.println(emp));
		
		empList
		.stream()
		.filter(emp -> emp.getEmpName().startsWith("H"))
		.map(emp -> emp.getEmpName())
		.forEach(emp -> System.out.println(emp));
	 }

}
