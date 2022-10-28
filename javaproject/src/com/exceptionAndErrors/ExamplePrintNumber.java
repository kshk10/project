package com.exceptionAndErrors;

public class ExamplePrintNumber {
	public void printNumber() {
		System.out.println(" Hi ");
		int i = 10 / 0;
		System.out.println(" Hello ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePrintNumber c = new ExamplePrintNumber();
		c.printNumber();
		System.out.println(" Hey ");
	}
}