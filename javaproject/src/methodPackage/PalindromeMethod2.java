package methodPackage;

public class PalindromeMethod2 {
	public static boolean Palindrome(String name) {
		char[] array = name.toCharArray();
		int endindex = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {
			char firstletter = name.charAt(i);
			char lastletter = name.charAt(endindex--);
			if (firstletter != lastletter)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean ispalindrome = Palindrome("madam");
		if (ispalindrome) {
			System.out.println("The given name is palindrome");
		} else {
			System.out.println("The given name is not a palindrome");
		}
	}
}