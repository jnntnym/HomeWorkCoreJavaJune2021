package java_oop_exam;
/*
 * 02) Create a package 'java_oop_exam' (The code needs to prepare according to the question): Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible. [points: 70] .

 */

public class LandPhone extends SatelitePhone implements Phone {

	@Override
	public void interfaceInfo() {

		System.out.println("Q:What are the features of Interface you know? \n" + " Answer: \n"
				+ " 1.Interface is a process to hide implementation. All methods are declared as abstract or unimplemented. 2.Interface can inherit two or more interface by extends keyword. It will not use implements keyword.\n"
				+ " 3.Interface can not inherit Regular or Abstract class.\n"
				+ " 4.We can write abstract keyword in method or not.\n"
				+ " 5.From java 1.8 version ,default and static methods are allowed in interface which has a body.\n"
				+ "  \n" + " Q:Can we create a constructor inside an interface? \n" + " Answer:\n"
				+ "  Interface can not have any Constructor.\n" + " \n"
				+ " Q:Can we write variables inside Interface? \n" + " Answer:\n"
				+ "  Interface doesn't allow to declare any instance variables, it's a compile time error. \n"
				+ "  But we can declare and initialize constant variables using static final. Only declare variable, shows error.\n"
				+ "  \n" + " Q:Do you think we can extends or implements Interface? Single or multiple?\n"
				+ " Answer:\n" + "  1.We can extends multiple interface inside interface class by extends keyword. \n"
				+ "  2.On the other side, we can implements multiple interface inside regular class and Abstract class by implements keyword.\n");

		System.out.println(
				"Interface Phone Class> public abstract void interfaceInfo()> @Override > LandPhone Regular Class");

	}

	@Override
	public void call() {
		System.out.println("Interface Phone Class> public abstract void call()> @Override > LandPhone Regular Class");

	}

	@Override
	public void message() {
		System.out
				.println("Interface Phone Class> public abstract void message()> @Override > LandPhone Regular Class");

	}

	@Override
	public void camera() {
		System.out.println(
				"Interface Phone Class> public abstract void interfaceInfo()> @Override > LandPhone Regular Class");

	}

}
