package com.methodPackage;

import java.util.Scanner;

public class SimpleMulDivUsingScanner {

	public static int multiplication(int c, int d) {
		int product = c * d;
		return product;
	}

	public static int divison(int e, int f) {
		int divide = e / f;
		return divide;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the numbers to multiply = ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mul = multiplication(a, b);
		{
			System.out.println(mul);
		}
		System.out.println("Please Enter the numbers to divide = ");
		int g = sc.nextInt();
		int h = sc.nextInt();
		int div = divison(g, h);
		{
			System.out.println(div);
		}
	}
}