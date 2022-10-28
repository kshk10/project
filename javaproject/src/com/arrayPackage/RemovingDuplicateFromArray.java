package com.arrayPackage;

public class RemovingDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 8, 10, 8, 12 };
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				if (array[i] == array[j] && array[i] != -1) {
					array[j] = -1;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1)
				System.out.println(array[i]);
		}
	}
}