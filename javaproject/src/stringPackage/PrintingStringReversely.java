package stringPackage;

public class PrintingStringReversely {

	public static void main(String[] args) {
		String name = "India";
		char array[] = name.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		System.out.println(reverse);
	}
}