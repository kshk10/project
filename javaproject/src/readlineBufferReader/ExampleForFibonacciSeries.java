package readlineBufferReader;

public class ExampleForFibonacciSeries {
	public static void FibonacciSeries(int a) {
		int number1 = 0;
		int number2 = 1;
		int Sum = 0;
		for (int i = 0; i <= a; i++) {
			System.out.println(number1);
			Sum = number1 + number2;
			number1 = number2;
			number1 = Sum;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries(10);
	}
}