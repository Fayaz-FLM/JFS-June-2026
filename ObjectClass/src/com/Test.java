package com;

public class Test {
	
	public static void main(String[] args) {
		
		Student st = new Student(1, "Fayaz");
		
		Student st2 = new Student(2, "Ajay");
		
		Student st3 = new Student(2, "Ajay");
		
		Student st4 = new Student(1, "Fayaz");
		
		boolean isEqual = st.equals(st2);
		System.out.println(isEqual);
		
		boolean isEqual2 = st2.equals(st3);
		System.out.println(isEqual2);
		
		
		int stHashCode = st.hashCode();
		int st2HashCode = st2.hashCode();
		int st3HashCode = st3.hashCode();
		int st4HashCode = st4.hashCode();
		
		System.out.println(stHashCode);
		System.out.println(st2HashCode);
		System.out.println(st3HashCode);
		System.out.println(st4HashCode);
		
		String s1 = "FLM";
		String s2 = "FLM";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		System.out.println(st);
		System.out.println(st2);
		System.out.println(st4);
	}

}
