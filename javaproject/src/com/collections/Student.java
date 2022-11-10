package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> Student = new ArrayList<Student>();
		Student s1 = new Student(1, "Aruna");
		Student s2 = new Student(2, "Asaf");
		Student s3 = new Student(3, "Ali");
		Student s4 = new Student(4, "Rajkiran");
		Student s5 = new Student(5, "Rajkamal");
		Student s6 = new Student(6, "Rajshree");
		Student.add(s1);
		Student.add(s2);
		Student.add(s3);
		Student.add(s4);
		Student.add(s5);
		Student.add(s6);
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
		System.out.println(s3.id + " " + s3.name);
		System.out.println(s4.id + " " + s4.name);
		System.out.println(s5.id + " " + s5.name);
		System.out.println(s6.id + " " + s6.name);
	for (Student student : Student) {
		
	}
	}
}