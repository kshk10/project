package com.methodPackage;

import java.util.Scanner;

public class OddorEveninMethod {

	public static int[] forEven(int array[]) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
			}
		}
		return array;
	}

	public static int[] forOdd(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array length");
		int length = sc.nextInt();
		int[] inputarray = new int[length];
		for (int i = 0; i < inputarray.length; i++) {
			System.out.println("Enter the " + i + " th index");
			int array = sc.nextInt();
			inputarray[i] = array;
		}
		int[] outputEven = forEven(inputarray);
		for (int i = 0; i < outputEven.length; i++) {
			System.out.println("The Even numbers are " + outputEven);	
		}
		

		int[] outputOdd = forOdd(inputarray);

		System.out.println("The Odd numbers are " + outputOdd);

	}
}