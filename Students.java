package week3.day1;
//Week3.day1- Assignment_4
public class Students {

	public void getStudentInfo(int Id) {
		System.out.println("Student Id: " + Id);
	}

	public void getStudentInfo(int Id, String Name) {
		System.out.println("Department Id: " + Id);
		System.out.println("Student Name: " + Name);
	}

	public void getStudentInfo(String Mail, long Number) {
		System.out.println("Student Number: " + Number);
		System.out.println("Student Mail: " + Mail);

	}

	public static void main(String[] args) {
		Students studentInfo = new Students();
		studentInfo.getStudentInfo(41164045);
		studentInfo.getStudentInfo(114, "Sharath Chandran");
		studentInfo.getStudentInfo("sharath@gmail.com", 9876543210L);
	}
}
