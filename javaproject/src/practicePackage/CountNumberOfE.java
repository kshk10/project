package practicePackage;

public class CountNumberOfE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "Selenium Web Driver";
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			// if (line.charAt(i)=='e')
			if (ch == 'e')
				count++;
		}
		System.out.println(count);
	}
}