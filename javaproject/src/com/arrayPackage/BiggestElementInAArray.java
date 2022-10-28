package com.arrayPackage;

public class BiggestElementInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 9, 11, 23, 8 };
		int big = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > big) {
				big = array[i];
			}
		}
		System.out.println("Biggest element in array is : " + big);
	}
}