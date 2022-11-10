package practicePackage;

public class ReverseStringByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Selenium Web Driver";
		String[] ch = line.split(" ");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " ");
		}
	}
}