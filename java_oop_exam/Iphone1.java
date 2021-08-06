package java_oop_exam;

/*
 * 04) Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 70] .
 */

/*
 * 05) Assume 4 private variables -- price (as int), Info (as String, write few words when you bought it), user (as a char, M or F), madeInUSA (as boolean) inside Iphone1 class. If the variables are private how can you use those variable? What kind of concept you can use? use it just after the variables. Now print out in TestPhone: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false". [points: 70] .
 */

/*
 * 06) NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. in 2002, Iphone4 come into the market which inherits Iphone2. in 2003, Iphone5 come into the market which inherits Iphone4. In 2004, Iphone6 come into the market which inherits Iphone5. Consider all of them as a regular class and write a method inside them related to one of the features like ---- map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to 780$"), youtube, dropbox, photos, email, compass, etc (6 methods for 6 class). What kind of concept you can use to relate to them? Instantiate Iphone6 and show how many methods they can call in TestPhone. [points: 70] .
 */
/*
 * 07) Again, from Iphone1, we got 4 private variables we know. Create 2 constructors inside it using that 4 private variables -- default and parameterized after those variables. In IPhone2, declare a char variable userOfIphone2 (M or F). create default and parameterized constructor, a void type method iPhone2Info, a parameterized method with same name iPhone2Info inside Iphone2 class. Use the super method and super keyword in constructor, and super keyword in methods of Iphone2. Call constructor and methods. Can you call variable by super keyword? create a public variable inside Iphone1 and execute it in Iphone2. Execute all of them in TestPhone. [points: 70]
 */

public class Iphone1 extends AppleWatch implements Phone { // Yes, we make a relation of Iphone1 with Phone Interface
															// and AppleWatch Abstract class.

// Q:5 Part encapsulation
	private int price; // This part of the question-5
	private String Info;
	private char user;
	private boolean madeInUSA;

	public String Iphone2; // Q:7 Part

// Q:7 Part - default Constructor
	public Iphone1() {
		System.out.println("This is default Constructor from Iphone1 Class");
	}

// Q:7 Part - Parameterized Constructor using private variables
	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.Info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
		System.out.println("This is Parameterized Constructor from Iphone1 Class");
	}

	/*
	 * Q:5 If the variables are private how can you use those variable? What kind of
	 * concept you can use? Answer: when the variables are private, this is
	 * Encapsulation. We can use Getters and Setters method to access this
	 * variables.
	 */

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	// Q:4 Part is below:
	public void regularClassInfo() {

		System.out.println("This is Iphone1- Regular Class");
		System.out.println("regular Class info:"
				+ "1. We can inherit eiher only one regular class or only one abstract class by extends keyword"
				+ "2. We can inherit multiple interface by implements keyword"
				+ "3. Methods only implemented in regular class, not allowed declared method"
				+ "4. We can create Constructor inside regular method"
				+ "5. We can create a Static method inside regular class"
				+ "6. we can declare or/and initialize variables in regular class"
				+ "7: Relation among them is: All are OOP features in java and used in inherite the properties from other class");

	}

	@Override
	public void interfaceInfo() {
		System.out.println(
				"Abstract Class Phone> public abstract void interfaceInfo()> @Override > Regular class Iphene1");

	}

	@Override
	public void call() {
		System.out.println("Abstract Class Phone> public abstract void call()> @Override > Regular class Iphene1");

	}

	@Override
	public void message() {
		System.out.println("Abstract Class Phone> public abstract void message()> @Override > Regular class Iphene1");

	}

	@Override
	public void camera() {
		System.out.println("Abstract Class Phone> public abstract void camera()> @Override > Regular class Iphene1");

	}

	@Override
	public void appleWatchInfo() {
		System.out.println(
				"Abstract Class Applewatch> public abstract void appleWatchInfo()> @Override > Regular class Iphene1");

	}

// Q:6 Part is below
	public void compass() {
		System.out.println("Compass is introduce in Iphone1.");
	}

}
