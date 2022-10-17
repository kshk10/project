package stringPackage;

public class EqualsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "India";
		String s2 = "Hindustan";
		System.out.println( s1==s2 );
		System.out.println(s1.equals(s2));
		String s3 = "Hello";
		String s4 = "Hello";
		s1 = s1.concat("Buddy");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}