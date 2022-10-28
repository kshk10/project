package com.printingStarPatterns;

public class PrintingPyramidTriangle {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int column = 5; column >= row; column--) {
				System.out.print(" ");
			}
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}