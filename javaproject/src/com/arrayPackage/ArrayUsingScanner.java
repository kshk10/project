 package com.arrayPackage;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter array length = ");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i <= array.length; i++) {
			System.out.println("Enter the " + i + " index value");
			int value = sc.nextInt();
		}
	}
}