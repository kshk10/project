package com.methodPackage;

import java.util.Scanner;

public class StudentsResultsUsingMethods {
	public static boolean isStudentPassed(int[] studentmarks, int passmark) {
		for (int i = 0; i < studentmarks.length; i++) {
			if (studentmarks[i] < passmark) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Subjects");
		int numberOfSubjects = sc.nextInt();
		int[] marks = new int[numberOfSubjects];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Please enter " + i + " subject mark : ");
			int mark = sc.nextInt();
			marks[i] = mark;
		}
		System.out.println("Enter the Passmark");
		int passmark = sc.nextInt();
		boolean studentPassed = isStudentPassed(marks, passmark);
		if (studentPassed) {
			System.out.println("Student Passed");
		} else {
			System.out.println("Studend Failed");
		}
	}

}