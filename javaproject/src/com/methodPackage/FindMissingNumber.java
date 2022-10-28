package com.methodPackage;

import java.util.Scanner;

public class FindMissingNumber {
	int num;
	int sumOfNumbers;
	int missingNumber;

	public FindMissingNumber(int num) {
		sumOfNumbers = (num * (num + 1)) / 2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[num - 1];
		for (int i = 0; i < num - 1; i++) {
			System.out.println("Enter numbers " + i);
			int values = sc.nextInt();
			array[i] = values;
			sum = sum + array[i];
		}
		if (sum != sumOfNumbers) {
			missingNumber = sumOfNumbers - sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMissingNumber number = new FindMissingNumber(10);
		System.out.println(number.missingNumber);
	}
}