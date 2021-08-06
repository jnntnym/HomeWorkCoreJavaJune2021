package java_oop_exam;
/*
 * 03) Assume AppleWatch is an abstract class which has 2 method: One is abstractClassInfo [which is a non-abstract method, print out all the features of an abstract class compared with Interface, regular class]. what type of method would be the other one - name appleWatchInfo? Can you create a constructor inside Abstract Class? Create two interface names Watch, DigitalWatch. And a regular class name AppleWatchSeries5. Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] .

 */

public abstract class AppleWatch {
	public void abstractClassInfo() { // Implemented method
		System.out.println("This is Non Abstract AppaleWatch method in Abstract class");
		System.out.println("Abstract Class feature:" + "1. We must use abstract keyword in Abstract class"
				+ "2. It contains variable and parameterized methods"
				+ "3. We can inherit either only one Abstract class or only one Regular class by extends keyword"
				+ "4. We can inherit multiple interface by implements keyword"
				+ "5. We must use abstract keyword in abstract method inside abstract class"
				+ "6. Method can be implemented or declared in abstract class");
	}

	public abstract void appleWatchInfo(); // Method declared

	public AppleWatch() { // We can create Constructor inside abstract class
		System.out.println("This is abstract class Constructor");

	}

	public static void appleWatch() {
		System.out.println("This is abstract class Static Method");

	}

}
