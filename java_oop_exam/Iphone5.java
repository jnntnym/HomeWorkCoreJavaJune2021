package java_oop_exam;

/*
 * 06) NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. in 2002, Iphone4 come into the market which inherits Iphone2. in 2003, Iphone5 come into the market which inherits Iphone4. In 2004, Iphone6 come into the market which inherits Iphone5. Consider all of them as a regular class and write a method inside them related to one of the features like ---- map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to 780$"), youtube, dropbox, photos, email, compass, etc (6 methods for 6 class). What kind of concept you can use to relate to them? Instantiate Iphone6 and show how many methods they can call in TestPhone. [points: 70] .
 */
public class Iphone5 extends Iphone4 {
	public void email() {
		System.out.println("Email is introduce in Iphone5.");
	}

}
