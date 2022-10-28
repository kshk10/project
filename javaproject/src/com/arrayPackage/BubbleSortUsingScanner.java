package com.arrayPackage;

import java.util.Scanner;

public class BubbleSortUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array length");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element at " + i + " index");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}