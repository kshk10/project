package practicePackage;

public class PrintingStringInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "India";
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}
}