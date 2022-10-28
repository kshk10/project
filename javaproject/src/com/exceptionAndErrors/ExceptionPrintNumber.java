package com.exceptionAndErrors;

public class ExceptionPrintNumber {

	public void printNumber() {
		System.out.println(" Hi ");
		try {
			System.out.println(" Before Execution ");
			int i = 10 / 0;
			System.out.println(" After Execution ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(" Finally ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPrintNumber c = new ExceptionPrintNumber();
		c.printNumber();
		System.out.println(" Hey ");
	}
}