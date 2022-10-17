package operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 20;
		if (a == 20) {
			System.out.println("The given number " + a + " is equal to 20");
		} else if (a < 25) {
			System.out.println("The given number " + a + " is lesser than 25");
		} else if (a > 15) {
			System.out.println("The given number " + a + " is greater than 15");
		} else {
			System.out.println("The given number is not equal to " + a);
		}
	}
}