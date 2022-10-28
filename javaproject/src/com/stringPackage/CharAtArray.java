package com.stringPackage;

public class CharAtArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java is Programming Language";
		 
		 char[] result = s1.toCharArray();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		String replaceString = s1.replace("java", "lava");
		System.out.println(replaceString);
		System.out.println("Index of: " + s1.indexOf(2));
		System.out.println("to upper case: " + s1.toUpperCase());
		System.out.println("to lower case: " + s1.toLowerCase());
	}
}