package com.arrayPackage;

public class SearchingAnElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 8, 9, 11, 12 };
		int element = 11;
		int pos = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.println(element + " not found");
		} else {
			System.out.println(element + " found at position " + pos);
		}
	}
}