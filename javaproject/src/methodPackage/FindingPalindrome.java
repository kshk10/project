package methodPackage;

public class FindingPalindrome {
	public static boolean palindrome(String word) {
		String reverse = PrintingStringInReverse.Reverse(word);
		if (word.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean word = palindrome("Madam");
		if (word) {
			System.out.println("Yes it's a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}