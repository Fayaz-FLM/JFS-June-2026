package com.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsPractice {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "FLM");
		map.put(2, null);
		map.put(3, "FET");
		map.put(13, "FSA");
		map.put(14, "Edutech");
		map.put(5, "Media");
		map.put(null, "Front");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(null));
		
		
		
		// 3 ways 
		// keyset 
		// values 
		// entry set 
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			
			System.out.println(key + " = " + map.get(key));
			
		}
		
		System.out.println("===========");
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		System.out.println("=========================");
		
		
		
		for( Map.Entry<Integer, String> entry   : map.entrySet() ) {
			
			System.out.println(entry.getKey() + " = " + entry.getValue());
			
		}
		System.out.println("=================");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
		
			Entry<Integer,String> entry = iterator.next();
			System.out.println(entry.getKey() + " = "+entry.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void practcie() {
		Map map = new HashMap();
		
		map.put(1 , "Lakshmi");
		map.put(2 , "Sai");
		map.put(3 , "Sneha");
		map.put("Priya", 12);
		map.put('A', 65);
		map.put(4, "Sneha");
		map.put(4, "Fayaz");
		map.put(1, 'A');
		map.put(null, "Rushitha");
		map.put(null, "Murali");
		map.put(null, null);
		map.put(5, null);
		
		System.out.println(map);
	}

}
