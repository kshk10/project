package readlineBufferReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\Personal\\Documents\\India wiki.txt";
		File file = new File(fileName);
		FileReader fil = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fil);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		fil.close();
		br.close();
	}
}