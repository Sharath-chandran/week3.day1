package week3.day1;
//Week3.day1- Assignment_3
//Sub Class
public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This is the Deposit Account in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank Object = new AxisBank();
		Object.deposit();
		Object.savings();
		Object.fixed();
	}

}
