package com.constructorPackage;

public class StudentDetails {
	String name;
	long rollNumber;
	int standard;
	char section;
	char bloodGroup;
	int tamil;
	int english;
	int maths;

	public StudentDetails(String name1, long rollNumber1, int standard1, char section1, char bloodGroup1) {
		this.name = name1;
		this.rollNumber = rollNumber1;
		this.standard = standard1;
		this.section = section1;
		this.bloodGroup = bloodGroup1;

	}

	public static int totalMarks(int tamil1, int english1, int maths1) {
		int total = tamil1 + english1 + maths1;
		System.out.println(total);
		return total;

	}

	public static void main(String[] args) {
		StudentDetails Student1 = new StudentDetails("Krishna", 131101021, 10, 'A', 'B');
		System.out.println(Student1.name + " " + Student1.rollNumber + "  " + Student1.standard + "  "
				+ Student1.section + "  " + Student1.bloodGroup + "  ");
		Student1.totalMarks(91, 93, 100);

	}
}
