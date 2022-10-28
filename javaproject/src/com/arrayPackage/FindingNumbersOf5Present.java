package com.arrayPackage;

public class FindingNumbersOf5Present {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 5, 6, 7, 8, 9 };

		int findnumber = 5, total = 0;
		for (int i = 0; i < array.length; i++) {
			if (findnumber == array[i]) {
				total++;
			}
		}
		System.out.println("Number " + findnumber + " present " + total + " times ");
	}
}