package methodPackage;

import java.util.Scanner;

public class CheckIfTheStringIsPresent {
	public static boolean isStringPresent(String[] array, String findString) {
		for (int i = 0; i < array.length; i++) {
			if (findString.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	public static int noOfStringPresent(String[] array, String findString) {
		int count = 0;
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of String");
		int length = sc.nextInt();
		String[] array = new String[length];
		for (int i = 0; i < array.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("Enter the " + i + " String");
			String string = sc.nextLine();
			array[i] = string;
		}
		System.out.println("Enter the String to find");
		String findstring = sc.nextLine();
		boolean isPresent = isStringPresent(array, findstring);
		if (isPresent) {
			System.out.println("The Sring is present");
		} else {
			System.out.println("The String is not present");
		}
		int count = noOfStringPresent(array, findstring);
		System.out.println("The String is present " + ++count + " times");
	}
}