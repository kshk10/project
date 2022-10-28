package practicePackage;

public class PracticeArithematicOperators {
	public static int additionMethod(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int subtractionMethod(int x, int y) {
		int z = x - y;
		return z;
	}

	public static int multiplicationMethod(int a1, int b1) {
		int c1 = a1 * b1;
		return c1;
	}

	public static int divisionMethod(int x1, int y2) {
		int z1 = x1 / y2;
		return z1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(additionMethod(10, 20));
		System.out.println(subtractionMethod(50, 15));
		System.out.println(multiplicationMethod(5, 10));
		System.out.println(divisionMethod(100, 6));
	}
}