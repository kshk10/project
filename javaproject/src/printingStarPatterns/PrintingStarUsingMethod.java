package printingStarPatterns;

public class PrintingStarUsingMethod {
	public static int printstar(int num) {
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		return num;
	}

	public static void main(String[] args) {
		int i = 0;
		printstar(i);
	}
}