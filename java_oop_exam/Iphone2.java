package java_oop_exam;
/*
 * 06) NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. in 2002, Iphone4 come into the market which inherits Iphone2. in 2003, Iphone5 come into the market which inherits Iphone4. In 2004, Iphone6 come into the market which inherits Iphone5. Consider all of them as a regular class and write a method inside them related to one of the features like ---- map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to 780$"), youtube, dropbox, photos, email, compass, etc (6 methods for 6 class). What kind of concept you can use to relate to them? Instantiate Iphone6 and show how many methods they can call in TestPhone. [points: 70] .
 */

/*
 * 07) Again, from Iphone1, we got 4 private variables we know. Create 2 constructors inside it using that 4 private variables -- default and parameterized after those variables. In IPhone2, declare a char variable userOfIphone2 (M or F). create default and parameterized constructor, a void type method iPhone2Info, a parameterized method with same name iPhone2Info inside Iphone2 class. Use the super method and super keyword in constructor, and super keyword in methods of Iphone2. Call constructor and methods. Can you call variable by super keyword? create a public variable inside Iphone1 and execute it in Iphone2. Execute all of them in TestPhone. [points: 70]
 */

public class Iphone2 extends Iphone1 {

// Q:7 Part
	char userOfIphone2;

	public Iphone2() { // default Constructor
		super(); // super() method used in either default or parameterized constructor can be
					// called, here defaultConstructor
		// super.userOfIphone2; // Show error because-super keyword is used in child
		// class to inherit variables from the parent/super class.
		super.Iphone2 = "public variable inside Iphone1"; // Q:7 Yes, super key word can call the super class variable
															// to initialized.
		super.compass();// super keyword is used to call the methods from Regular (Parent) class
		System.out.println("This is default Constructor from Iphone2 Class");

	}

	public Iphone2(char userOfIphone2) { // Parameterized Constructor
		this.userOfIphone2 = userOfIphone2;
		System.out.println("This is Parameterized Constructor from Iphone2 Class");
		System.out.println("User's Sex of Iphone2 is:" + userOfIphone2);
	}

	public void iphone2Info() { // Void type method
		// super(); // Q:7 : here error- we can't call constructor or parameterized
		// constructor of super class inside a method of child class, but we can call
		// variable or methods of Parent class. here shows- Constructor call must be the
		// first statement in a constructor.
		System.out.println("This is void type method in Iphone2");
	}

	public void iphone2Info(char userOfIphone2) { // Parameterized Method
		System.out.println("This is void type parameterized method in Iphone2");
		System.out.println("User's Sex of Iphone2 is:" + userOfIphone2);
	}

// Q:6 Part	
	public void photos() {
		System.out.println("Photos is introduce in Iphone2.");
	}

}
