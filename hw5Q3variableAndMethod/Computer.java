package hw5Q3variableAndMethod;
/*
 * 03) Create a package name "hw5Q3variableAndMethod" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- "configuration" and use only one System.out.println(). Use the variables inside sysout. Create another class TestComputer. Create object under main method. Initialize object and method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class Computer {

	String Brand;
	String Model;
	String OperatingSystem;
	int price;
	boolean madeInUSA;
	char grade;

	public void configuration() {
		System.out.println("My Brand:" + Brand + "," + "Model:" + Model + "," + "Operating System:" + OperatingSystem
				+ "," + "Price:" + price + "," + "Made in USA?:" + madeInUSA + "," + "Product grade:" + grade);

	}

	public void configuration1() {
		System.out.println("My Brand:" + Brand + "," + "Model:" + Model + "," + "Operating System:" + OperatingSystem
				+ "," + "Price:" + price + "," + "Made in USA?:" + madeInUSA + "," + "Product grade:" + grade);

	}

}
