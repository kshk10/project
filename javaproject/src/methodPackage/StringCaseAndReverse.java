package methodPackage;

public class StringCaseAndReverse {
	public static String lowercase(String statement) {
		String output = "";
		String lowercaseword = statement.toLowerCase();
		String[] array = lowercaseword.split(" ");
		int lastindex = array.length - 1;// 8-1=7
		for (int i = 0; i < array.length; i++) {
			if (i == lastindex) {// i=7
				String lastword = array[lastindex];
				char arr[] = lastword.toCharArray();
				String reverseName = "";
				for (int a = arr.length - 1; a >= 0; a--) {
					reverseName = reverseName + arr[a];
					array[lastindex] = reverseName;
				}
			}
			output = output + array[i].concat(" ");
		}
		return output.trim();
	}

	public static void main(String[] args) {
		String name = lowercase("The T20 World Cup will starts in Australia");
		System.out.println(name);
	}
}