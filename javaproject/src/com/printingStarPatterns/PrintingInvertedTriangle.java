package com.printingStarPatterns;

public class PrintingInvertedTriangle {

	public static void main(String[] args) {
		for (int row = 5; row > 0; row--) {
			for (int column = 0; column < row; column++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}