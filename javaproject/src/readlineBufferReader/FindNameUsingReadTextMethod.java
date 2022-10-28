package readlineBufferReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindNameUsingReadTextMethod {
	public static String findWordCount(String fileName, String findName) throws Throwable {
		FileReader file = new FileReader(fileName);
		BufferedReader br = new BufferedReader(file);
		String eachLine;
		int count = 0;
		while ((eachLine = br.readLine()) != null) {
			String array[] = eachLine.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(findName))
					count++;
			}
		}
		file.close();
		br.close();
		String result = Integer.toString(count);
		return result;
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub			
		System.out.println(findWordCount("C:\\Users\\Personal\\Documents\\India wiki.txt", "India"));

	}
	
}