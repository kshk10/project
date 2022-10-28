package com.methodPackage;

public class ChocolateCountProgram {

	public static int ChocolateCount(int rupees) {
		int numberOfChocolates, numberOfWrappers;
		numberOfChocolates = rupees / 3;
		numberOfWrappers = numberOfChocolates;
		while (numberOfWrappers >= 3) {
			int extraChocolates = numberOfWrappers / 3;
			numberOfChocolates = numberOfChocolates + extraChocolates;
			int extraWrapper = numberOfWrappers % 3;
			numberOfWrappers = extraChocolates + extraWrapper;
		}
		return numberOfChocolates;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ChocolateCount(100));
	}
}