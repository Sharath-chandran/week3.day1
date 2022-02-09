package week3.day1;
//Sub-class- Assignment_1
public class Desktop extends Computer {
	String DesktopName = "HP- V20 Monitor";
	String DesktopType = "LED";

	public void desktopSize() {
		System.out.println("The name of the Desktop is " + DesktopName);
		System.out.println("The type of the Desktop is " + DesktopType);
	}

	public static void main(String[] args) {
		Desktop object = new Desktop();
		object.computerModel();
		object.desktopSize();

	}
}
