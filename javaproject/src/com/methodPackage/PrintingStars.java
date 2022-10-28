package com.methodPackage;

import java.util.Scanner;

public class PrintingStars {

	public static void printStars(int columns, int rowCount) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= columns; i++) {
			for (int j = 0; j <= rowCount; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give number of rows");
		int rowCount = scanner.nextInt();
		System.out.println("Please give number of Columns");
		int columns = scanner.nextInt();
		printStars(columns, rowCount);
	}
}