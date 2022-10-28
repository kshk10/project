package com.printingStarPatterns;

public class PrintingLakhStar {

	public static void main(String[] args) {
		for (int row = 0; row <= 1000; row++) {
			for (int column = 0; column < 100; column++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}