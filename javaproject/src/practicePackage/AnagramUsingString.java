package practicePackage;

import java.util.Arrays;

public class AnagramUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Cricket";
		String second = "ketcriC";
		char a[] = first.toCharArray();
		char b[] = second.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("The given word is Anagram");
		} else {
			System.out.println("The given word is not an Anagram");
		}
	}
}