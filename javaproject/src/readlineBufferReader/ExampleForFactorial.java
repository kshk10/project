package readlineBufferReader;

public class ExampleForFactorial {
	public static int Factorial(int i, int n) {
		int Fact = 1;
		for (i = 1; i <= n; i++) {
			Fact = Fact * i;
		}
		return Fact;
	}

	public static void main(String[] vargs) {

		int c = Factorial(1, 6);
		System.out.println(c);
	}
}