package com.stringPackage;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		s1 = s1.concat("Buddy");
		System.out.println(s1);
		String s2 = "Hello";
		s2 = s2.concat("Buddy");
		String s3 = s2.concat("Hello");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.substring(4));
		System.out.println(s1.length());
		boolean startswith = s1.startsWith("He");
		System.out.println(startswith);
	}
}