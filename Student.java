package org.student;
//Week3.day1- Assignment_2
import org.college.College;

public class Student extends College {
	String StudentName = "Sharath";
	String StudentDept = "Mechanical";
	int StudentId = 41164045;

	public void student_Name() {
		System.out.println("Student Name: " + StudentName);
	}

	public void student_Dept() {
		System.out.println("Student Department: " + StudentDept);
	}

	public void student_Id() {
		System.out.println("Student Id: " + StudentId);
	}

	public static void main(String[] args) {
		Student details = new Student();
		details.student_Name();
		details.student_Dept();
		details.student_Id();
		details.department_Name();
		details.college_Name();
		details.college_Code();
		details.college_Rank(0);

	}
}
