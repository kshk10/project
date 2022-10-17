package arrayPackage;

import java.util.Scanner;

public class ArrayUsingString {

	public static void main(String[] args) {
		String array[] = { "Sachin", "Sehwag", "Yuvraj", "Dhoni" };
		boolean isExist = false;
		String name = "Dhoni";
		for (int i = 0; i < array.length; i++) {
			if (name == array[i]) {
				isExist = true;
			}
		}
		if (isExist == true) {
			System.out.println("The String is present");
		} else {
			System.out.println("The String is not present");
		}
	}
}