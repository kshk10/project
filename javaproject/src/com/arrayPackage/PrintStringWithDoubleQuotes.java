package com.arrayPackage;

public class PrintStringWithDoubleQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement = "Moon Sun \"Jupiter is the largest planet\" Earth Saturn ";
		String temp = "";
		String array[] = new String[5];
		int arrayIndex = 0;
		int doubleQuotesCounter = 0;
		char sentence[] = statement.toCharArray();
		for (int i = 0; i < sentence.length; i++) {
			if (statement.charAt(i) == '"') {
				doubleQuotesCounter++;
			} else if ((doubleQuotesCounter % 2 == 0) && (statement.charAt(i) == ' ')) {
				array[arrayIndex++] = temp;
				temp = "";
			} else {
				temp = temp + sentence[i];
			}
		}
	
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
	}
}