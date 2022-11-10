package com.operators;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 153;
		int temp = number;
		int result = 0;
		while (number > 0) {
			int last = number % 10;
			result = result + (last * last * last);
			number = number / 10;
		}
		if (temp == result) {
			System.out.println(temp + " is armstrong number");
		} else {
			System.out.println(temp + " is not armstrong number");
		}
     	}
}