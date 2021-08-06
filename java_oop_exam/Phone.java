package java_oop_exam;

/*
 * 02) Create a package 'java_oop_exam' (The code needs to prepare according to the question): Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible. [points: 70] .

 */
public interface Phone extends Pager, Wakitaki {

	public static final String NAME = "Static final variable"; // we can only declare and must initialize constant
																// variables using static final.
	public static final int num = 10; // Only declare variable, shows error

	public abstract void interfaceInfo(); // Abstract method

	public abstract void call();

	public void message(); // We can write abstract keyword in method or not

	public void camera();

	public default void battery() {
		System.out.println("\nThis is Default type method in interface from:\t java 1.8");
		System.out.println("Static final string variable name: " + NAME);
		System.out.println("Static final int Number is: " + num);
	}

	public static void wireless() {
		System.out.println("\nThis is Static type method in interface from:\t java 1.8");
		System.out.println("Static final string variable name: " + NAME);
		System.out.println("Static final int Number is: " + num);
	}

	/*
	 * public abstract void interfaceInfo() { // we can't implement interfaceInfo()
	 * inside interface
	 * 
	 * }
	 */

	/*
	 * Q:What are the features of Interface you know? Answer: 1.Interface is a
	 * process to hide implementation. All methods are declared as abstract or
	 * unimplemented. 2.Interface can inherit two or more interface by extends
	 * keyword. It will not use implements keyword. 3.Interface can not inherit
	 * Regular or Abstract class. 4.We can write abstract keyword in method or not.
	 * 5.From java 1.8 version ,default and static methods are allowed in interface
	 * which has a body.
	 * 
	 * Q:Can we create a constructor inside an interface? Answer: Interface can not
	 * have any Constructor.
	 * 
	 * Q:Can we write variables inside Interface? Answer: Interface doesn't allow to
	 * declare any instance variables, it's a compile time error. But we can declare
	 * and must initialize constant variables using static final. Only declare
	 * variable, shows error.
	 * 
	 * Q:Do you think we can extends or implements Interface? Single or multiple?
	 * Answer: 1.We can extends multiple interface inside interface class by extends
	 * keyword. 2.On the other side, we can implements multiple interface inside
	 * regular class and Abstract class by implements keyword.
	 */

}
