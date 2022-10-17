package stringPackage;

import java.util.Scanner;

public class EqualsInStringUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name ");
		String name = sc.nextLine();
		if (name.equals("India")) {
			System.out.println("The given name is = " + name);
		} else if (name.equals("Defence")) {
			System.out.println("The name is not = " + name);
		} else {
			System.out.println("mm");
		}
	}
}