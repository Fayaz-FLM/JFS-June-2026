package com;

public class Test {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("FLM");
		sb.append(" Edutech");
		System.out.println(sb);
		
		System.out.println(sb.length());
		sb.insert(3, "-");
		System.out.println(sb);
		sb.replace(3, 5, "-");
		System.out.println(sb);
		
		sb.delete(3, 11);
		System.out.println(sb);
		
//		sb.deleteCharAt(6);
//		System.out.println(sb);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println(sb2);
		
		
		StringBuilder st = new StringBuilder();
		st.append("Java Programming");
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		StringBuilder st2 = new StringBuilder();
		st2.append("Java Programming");
		System.out.println(st2.length());
		System.out.println(st2.capacity());
		
		StringBuilder st3 = new StringBuilder("FLMM");
		System.out.println(st3.length());
		System.out.println(st3.capacity());
		
		String str = st3.toString();
		System.out.println(str);
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("kk");
	}
	
}
