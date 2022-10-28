package com.printingStarPatterns;

public class PrintNumbersInTriangles {

	public static void main(String[] args) {
		int c = 0;
		for (int row = 1; row < 5; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print(++c + " ");
			}
			System.out.println();
		}
	}
}