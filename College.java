package org.college;
//Week3.day1- Assignment_2
import org.department.Department;

public class College extends Department {
	String CollegeName = "Anna University";
	int CollegeCode = 4116;
	int CollegeRank = 55;

	public void college_Name() {
		System.out.println("College Name: " + CollegeName);
	}

	public void college_Code() {
		System.out.println("College Code: " + CollegeCode);
	}

	public void college_Rank(int Id) {
		System.out.println("College Rank: " + CollegeRank);
	}

}
