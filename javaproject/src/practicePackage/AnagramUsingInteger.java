package practicePackage;

import java.util.Arrays;

public class AnagramUsingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 1234;
		int second = 4312;
		String a = Integer.toString(first);
		String b = Integer.toString(second);
		char arr[] = a.toCharArray();
		char array[] = b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(array);
		boolean result = Arrays.equals(arr, array);
		if (result = true) {
			System.out.println("The given integer is Anagram");
		} else {
			System.out.println("The given integer is not Anagram");
		}
	}
} 