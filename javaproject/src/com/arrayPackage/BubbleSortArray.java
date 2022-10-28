package com.arrayPackage;

public class BubbleSortArray {

	public static void main(String[] args) {
		int array[] = { 20, 11, 13, 14 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}
}