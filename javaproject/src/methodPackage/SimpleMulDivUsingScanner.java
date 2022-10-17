package methodPackage;

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
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("Please Enter the numbers to divide = ");
		int e = sc.nextInt();
		int f = sc.nextInt();
		System.out.println(product);
		System.out.println(divide);
	}
}