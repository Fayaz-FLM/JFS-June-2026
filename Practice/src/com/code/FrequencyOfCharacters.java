package com.code;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		String str = "PROGRAMMING";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i<str.length(); i++) {
		
			char ch = str.charAt(i);
			
			map.getOrDefault(ch, 0);
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(map);
		
	}

	private static void basic() {
		String str = "AAAABCBC";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			
			char c = str.charAt(i);
			
			if(map.get(c) == null) {
				
				map.put(c, 1);
				
			}else {
				
				Integer count = map.get(c);
				map.put(c, count+1);
				// A, 3
			}
			
			
		}
		
		System.out.println(map);
	}

}
