package com.arrayPackage;

import java.util.Scanner;

public class MaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int n, max = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in Array");
			n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("The elements of array");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println("The Maximum Elements ; " + max);
		}
	}
}