package com.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsPractice {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(10);
		System.out.println(set);
		
		for(Integer num : set) {
			System.out.println(num);
		}
		
		System.out.println("==========");
		
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set);
		set.remove(50);
		System.out.println(set);
		
		
		System.out.println("=====================");
		
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();
		
		linkedSet.add(50);
		linkedSet.add(10);
		linkedSet.add(20);
		linkedSet.add(10);
		linkedSet.add(30);
		linkedSet.add(40);
		linkedSet.add(40);
		linkedSet.add(null);
		linkedSet.add(null);
		
		System.out.println(linkedSet.size());
		System.out.println(linkedSet);
		
		
		System.out.println("======================");
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(null);
		
		System.out.println(treeSet.size());
		System.out.println(treeSet);
		
	}

}
