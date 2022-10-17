package printingStarPatterns;

public class PrintingLeftSidedTriangle {

	public static void main(String[] args) {
		int n = 5;
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 2 * (n - i); j >= 0; j--) {
				System.out.print("1");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}