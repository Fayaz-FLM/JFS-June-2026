package com.optional;

import java.util.Optional;

public class OptionalOperations {
	
	public static void main(String[] args) {
		
		String name = "Fayaz";
		
		System.out.println(name.length());
		
		Optional<String> name1 = Optional.of("Fayaz");
		
		System.out.println(name1.get().length());
		
//		Optional<String> empty = Optional.empty();
//		
//		System.out.println(empty.get().length());
		
		Optional<String> name2 = Optional.ofNullable("fayaz");
		
		System.out.println(name2.orElse("Invalid Value"));
		
		
		System.out.println(name2.orElseThrow( () -> new RuntimeException("My Exception") ));
		
		
		Optional<Boolean> name3 = Optional.ofNullable(true);
		
		if(name3.isPresent()) {
			System.out.println(name3.get());
		}
		else {
			System.out.println("No value");
		}
		
		
		
		
	}
}
