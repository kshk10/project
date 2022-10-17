package methodPackage;

public class SplittingStringUsingMethods {
	public static String SplitReverse(String statement) {
		String reverseString = "";
		String array[] = statement.split(" ");
		for (int i = 0; i < array.length; i++) {

			String reverseword = PrintingStringInReverse.Reverse(array[i]);
			reverseString = reverseString + reverseword + " ";
		}
		return reverseString.trim();
	}

	public static void main(String[] args) {
		String output = SplitReverse("India is my Country");
		System.out.println(output);
	}
}