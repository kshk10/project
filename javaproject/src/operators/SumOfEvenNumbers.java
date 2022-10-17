package operators;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int a = 0;
		for (int b = 2; b <= 20; b = b + 2) {
			a = a + b;
		}
		System.out.println("The sum of even number is " + (a));
	}
}