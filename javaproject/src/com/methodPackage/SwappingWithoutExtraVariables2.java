package com.methodPackage;

public class SwappingWithoutExtraVariables2 {

	public static void SwapTwoNumbers(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " , " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers(10, 20);
	}
}