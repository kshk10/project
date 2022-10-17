package methodPackage;

import java.util.Scanner;

public class SumOfEvenNumbersUsingMethod {
	public static int sumOfEvenNumbers(int startNumber, int endNumber) {
		int sum = 0;
		if (startNumber > endNumber) {
			int temp = startNumber;
			startNumber = endNumber;
			endNumber = temp;
		}
		for (int i = startNumber; i <= endNumber; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static int sumOfOddNumbers(int startNumber, int endNumber) {
		int sum = 0;
		if (startNumber > endNumber) {
			int temp = startNumber;
			startNumber = endNumber;
			endNumber = temp;
		}

		for (int i = startNumber; i < endNumber; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start number");
		int Startnumber = sc.nextInt();
		System.out.println("Enter the End number");
		int Endnumber = sc.nextInt();
		int sumOfEvennumbers = sumOfEvenNumbers(Startnumber, Endnumber);
		System.out.println(sumOfEvennumbers);
		int sumOfOddNumbers = sumOfOddNumbers(Startnumber, Endnumber);
		System.out.println(sumOfOddNumbers);
	}
}