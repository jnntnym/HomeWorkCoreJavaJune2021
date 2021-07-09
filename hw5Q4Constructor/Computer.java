package hw5Q4Constructor;
/*
 * 04) Create a package name "hw5Q4Constructor" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class Computer {

	String Brand;
	String Model;
	String OperatingSystem;
	int price;
	boolean madeInUSA;
	char grade;

// 1st
	public Computer() {
		System.out.println("This is from default Constructor of Computer Class");
	}

// 2nd
	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade, boolean madeInUSA) {
		System.out.println("My Brand:" + Brand + "," + "Model:" + Model + "," + "Operating System:" + OperatingSystem
				+ "," + "Price:" + price + "," + "Grade:" + grade + "," + "Made in USA?:" + madeInUSA);
	}

//3rd
	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUSA, char grade) {
		System.out.println("My Brand:" + Brand + "," + "Model:" + Model + "," + "Operating System:" + OperatingSystem
				+ "," + "Price:" + price + "," + "Grade:" + grade + "," + "Made in USA?:" + madeInUSA);
	}

//4th
	public Computer(String Brand) {
		System.out.println("My Brand:" + Brand);
	}

//5th
	public Computer(String Brand, String Model, int price) {
		System.out.println("My Brand:" + Brand + "," + "Model:" + Model + "," + "Price:" + price);
	}

//6th
	public Computer(String Brand, String OperatingSystem, int price, boolean madeInUSA, char grade) {
		System.out.println("My Brand:" + Brand + "," + "Operating System:" + OperatingSystem + "," + "Price:" + price
				+ "," + "Grade:" + grade + "," + "Made in USA?:" + madeInUSA);
	}

}