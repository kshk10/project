package practicePackage;

import java.util.Scanner;

public class PracticeArithematicOperatorsUsingScanner {
	public static int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int subtraction(int a, int b) {
		int z = a - b;
		return z;
	}

	public static int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int division(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(addition(a, b));
		System.out.println(subtraction(a, b));
		System.out.println(multiplication(a, b));
		System.out.println(division(a, b));
	}
}