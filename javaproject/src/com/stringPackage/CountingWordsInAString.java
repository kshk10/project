package com.stringPackage;

public class CountingWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " palle technologies java j2ee training";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total words = " + count);
	}
}