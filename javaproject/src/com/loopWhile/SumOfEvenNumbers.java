package com.loopWhile;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println("Even Sum =" + sum);
	}
}