package com.loopWhile;

public class PrintNumberTriangleUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int count = 0;
		while (row <= 5)
		{
			for (int column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for (int column = 5; column >= row; column--) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
			row++;
		}
	}
}