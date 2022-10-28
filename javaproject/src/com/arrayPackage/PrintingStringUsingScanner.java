package com.arrayPackage;

import java.util.Scanner;

public class PrintingStringUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Please Enter the String length");
		int length = sc.nextInt();
		String array[] = new String[length];
		for (int i = 0; i < array.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Please enter " + i + " th index");
			String name = sc.nextLine();
			array[i] = name;
		}
		System.out.println("Enter the name to find");
		String findname = sc.nextLine();
		for (int i = 0; i < array.length; i++) {

			if (findname.equals(array[i]))
				count++;

		}
		System.out.println(count);
	}
}