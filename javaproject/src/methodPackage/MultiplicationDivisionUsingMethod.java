package methodPackage;

public class MultiplicationDivisionUsingMethod {

	public static int multiplication(int c, int d) {
		int product = c * d;
		return product;
	}

	public static int division(int e, int f) {
		int division = e / f;
		return division;
	}

	public static void main(String[] args) {
		int a = multiplication(5, 10);
		int s = division(20, 5);
		System.out.println(a);
		System.out.println(s);
	}
}