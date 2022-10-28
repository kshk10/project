package com.constructorPackage;

public class FindFirstRepeatedLetter {
	public static char RepeatedLetter(String word) {
		char[] name = word.toCharArray();
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {
					return name[i];
				}
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RepeatedLetter("geekforgeeks"));
	}
}