package methodPackage;

public class AdditionSubtractionUsingMethods {
	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int subtraction(int x, int y) {
		int dec = x - y;
		return dec;
	}

	public static void main(String[] args) {
		int a = addition(5, 10);
		int s = subtraction(20, 15);
		System.out.println(a);
		System.out.println(s);
	}
}