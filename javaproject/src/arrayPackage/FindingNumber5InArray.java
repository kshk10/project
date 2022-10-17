package arrayPackage;

public class FindingNumber5InArray {

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < number.length; i++)
			if (number[i] == 5) {
				System.out.println("The number is exist");
			} else {
				System.out.println("The number is not exist");
			}
	}
}