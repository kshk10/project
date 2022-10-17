package operators;

public class IncrementBy2 {
	public static int IncrementBy2(int a) {
		int value = a + 2;
		return value;
	}

	public static void main(String[] args) {
		int value = IncrementBy2(5);
		System.out.println(value);
	}
}