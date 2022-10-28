package com.arrayPackage;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0) {
				a = a + number[i];
			}
		}
		System.out.println(a);
	}
}