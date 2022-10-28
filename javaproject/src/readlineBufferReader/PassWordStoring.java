package readlineBufferReader;

public class PassWordStoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Pwd = "ALTER";
		System.out.println(" String Password : " + Pwd);
		char[] Pwda = Pwd.toCharArray();
		for (int i = 0; i < Pwda.length; i++) {

			System.out.print(Pwda[i]);
		}
	}
}