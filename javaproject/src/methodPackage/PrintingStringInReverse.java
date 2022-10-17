package methodPackage;

public class PrintingStringInReverse {

	public static void main(String[] args) {
		System.out.println(Reverse("India"));
	}

	public static String Reverse(String name) {
		char array[] = name.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		return reverse;
	}
}