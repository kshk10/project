package arrayPackage;

public class SwappingArrayVariables {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap of a = " + a);
		System.out.println("Swap of b = " + b);
	}
}