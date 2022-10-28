package com.operators;

import java.util.Scanner;

public class LogicalOperatorsUsingScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int a = scanner.nextInt();
		if (a < 0) {
			System.out.println("The given number is negative ");
		} else if (a >= 0 && a <= 0) {
			System.out.println("The given number is zero ");
		} else if (a > 0 && a < 100) {
			System.out.println("The given number is between 0 to 99 ");
		} else if (a >= 0 && a <= 100) {
			System.out.println("The given number is between 0 to 100 ");
		} else if (a > 100 && a < 200) {
			System.out.println("The given number is between 101 to 200");
		} else {
			System.out.println("The given nunmber is greater than 200");
		}
	}
}