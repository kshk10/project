package com.stringPackage;

public class CountingVowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "palle technologies";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Total vowels = " + count);
	}
}