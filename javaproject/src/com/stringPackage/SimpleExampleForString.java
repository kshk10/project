package com.stringPackage;

public class SimpleExampleForString {

	public static void main(String[] args) {
		String city = "Chennai";
		if (city.equals("chennai"))
			System.out.println("The given name is " + city + ".");
		else if (city.equals("Bengaluru"))
			System.out.println("The given name is wrong.");
		else {
			System.out.println("The given name is Madras.");
		}
	}
}