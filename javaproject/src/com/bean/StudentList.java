package com.bean;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentlist = new ArrayList<>();
		Student s1 = new Student(1, "Radha");
		Student s2 = new Student(2, "Krishna");
		Student s3 = new Student(3, "Sita");
		Student s4 = new Student(4, "Ram");
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		for (Student student : studentlist) {
			if (student.getName().startsWith("S")) {
				System.out.println(student.getId() + " " + student.getName());
			}
		}
	}

}
