package readlineBufferReader;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer(" Welcome "); // 1st line
		System.out.println(str);
		System.out.println(str.append(" to My World")); // adding the string to line
		System.out.println(str.insert(0, "Hai")); // inserting the string into 0th index
		System.out.println(str.delete(0, 3)); // delete the string from required index to required index
		// System.out.println(str.reverse());// reverse the sentence
		// System.out.println(str.replace(8, 18, "java"));
		System.out.println(str.length()); // length of the sentence
		System.out.println(str.indexOf("to")); // index number of the required string
		System.out.println(str.charAt(10)); // character at the required index
		System.out.println(str.substring(4)); //
		System.out.println(str.subSequence(7, 12)); // String between the two required index
	}
}