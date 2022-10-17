package arrayPackage;

public class AssigningArrayInIndex {
	public static void main(String[] args) {
		int array [] = new int [5];
		array [0] = 5;
		array [1] = 10;
		array [2] = 15;
		array [3] = 20;
		array [4] = 25;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array [i] );
		}
	}
}