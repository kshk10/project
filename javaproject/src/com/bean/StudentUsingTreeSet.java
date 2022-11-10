package com.bean;

import java.util.TreeSet;

public class StudentUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> studentlist = new TreeSet<>();
		Student s1 = new Student(1, "Radha");
		Student s2 = new Student(2, "Krishna");
		Student s3 = new Student(3, "Sita");
		Student s4 = new Student(4, "Ram");
		Student s5 = new Student(5, "Sita");
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		//for (Student student : studentlist) {
		//System.out.println(student);
		for (Student student : studentlist) {
			if (student.getName().startsWith("S")) {
				System.out.println(student.getId() + " " + student.getName());
			}
		}
	}
}