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

/*
 * 08) Now, Think about Iphone6. It also has 5 methods with the same name as materials(). For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you use the void, parameterized, final, or static method here as the same method name? if yes, create them and take more int variable of your own. What kind of concept you can use? [points: 70]. Instantiate the class in TestPhone and initialize those methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those methods and change the logic at your own to show the changes. [points: 50]. Show the output in TestPhone. [points: 50]. Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance. [points: 50].
 */

public class TestPhone {

	public static void main(String[] args) {
		
		// Q:4 Part Answer
		System.out.println("\n************* Iphone1-Regular Class ***************\n");
		Iphone1 ip = new Iphone1();	// Iphone1 is a regular class instantiated here
		ip.abstractClassInfo();		// void-apple watch
		ip.appleWatchInfo();			// abstract void-AppleWatch
		ip.battery();				// default void-Phone
		ip.call();  					// void-Iphone1 
		ip.camera(); 				// void-Iphone1
		ip.interfaceInfo(); 			// void-Iphone1
		ip.message(); 				// void-Iphone1
		ip.regularClassInfo(); 		// void-Iphone1
		
		System.out.println("\n************ AppleWatch-Abstract Class **************\n");
		/*
		 * AppleWatchSeries5 is a regular class. when A regular class extends one
		 * regular class or abstract class or/and implements multiple interfaces, that
		 * regular class (AppleWatchSeries5) is called concrete class. AppleWatch is
		 * an Abstract class and it can't be instantiated. It needs the help of a concrete
		 * class to create the objects.
		 */
		AppleWatch aw = new AppleWatchSeries5();	// AppleWatch- is a abstract class and AppleWatchSeries5- is a Concrete class
		aw.abstractClassInfo();		// void-apple watch
		aw.appleWatchInfo();			// abstract void-AppleWatch
		AppleWatch.appleWatch(); 	// Static Method-AppleWAatch called by Class name
		
		System.out.println("\n************ Phone-Interface Class *******************\n");
		/*
		 * Phone is an interface class. when A regular class extends one
		 * regular class or abstract class or/and implements multiple interfaces, that
		 * regular class (LandPhone) is called concrete class. Phone is
		 * an interface class and it can't be instantiated. It needs the help of a concrete
		 * class(LandPhone) to create the objects.
		 */
		
		Phone ph = new LandPhone(); // Phone-is an interface class and LandPhone-is a Concrete class
		ph.battery(); 		// default void-phone
		ph.call();			// abstract void-phone
		ph.camera();			// abstract void-phone
		ph.interfaceInfo(); // abstract void-phone
		ph.message();		// abstract void-phone
		Phone.wireless(); 	// static void-phone
		
		//Q:5 Part Answer
		System.out.println("\n************ IPhone1 -Encapsulation- Getters and Setters *******************\n");
		//when the variables are private, this is Encapsulation. We can use Getters and Setters method to access this variables. 
		// Set Info
		Iphone1 ph1 = new Iphone1();
		ph1.setPrice(750);
		ph1.setInfo("I bought this phone in Year 2000");
		ph1.setUser('M');
		ph1.setMadeInUSA(false);
		//Get info
		System.out.println(ph1.getInfo()+", the price was "+ph1.getPrice()+"$"+", User's Sex:"+ph1.getUser()+", made in USAis:"+ph1.isMadeInUSA());
		
		// Q:6 Part Answer
		System.out.println("\n************ IPhone6-Regular Class instantiated *******************\n");
		/*
		 * What kind of concept you can use to relate to them?
		 * Answer: We can use extends keyword to inherit one regular class properties from another regular class; this is called inheritance 
		 */
		Iphone6 ip6 = new Iphone6();	 //Instantiate Iphone6 class and called many methods 
		ip6.abstractClassInfo();
		ip6.appleWatchInfo();
		ip6.battery();
		ip6.call();
		ip6.camera();
		ip6.compass();
		ip6.photos();
		ip6.dropbox();
		ip6.youtube();
		ip6.email();
		ip6.interfaceInfo();
		ip6.message();
		ip6.regularClassInfo();
		// Set Info
		ip6.setInfo("I bought this phone in Year 2015");
		ip6.setPrice(800);
		ip6.setUser('M');
		ip6.setMadeInUSA(true);
		//Get Info
		System.out.println(ip6.getInfo()+", the price was "+ip6.getPrice()+"$"+", User's Sex:"+ip6.getUser()+", madeinUSAis:"+ip6.isMadeInUSA());
		//ip6.appleWatch(); //The static method appleWatch() from the type AppleWatch should be accessed in a static way
		
		// Q:7 Part
		System.out.println("\n************ IPhone2-Regular Class instantiated (Super Keyword) *******************\n");
		
		System.out.println("-------------------- Default Constructor initialized -------------------------\n");
		Iphone2 ip2 = new Iphone2();
		
		System.out.println("-------------------- Parameterized Constructor initialized --------------------\n");
		Iphone2 iphn2 = new Iphone2('M');
		iphn2.abstractClassInfo();
		
		System.out.println("-------------------- void type Regular Method  initialized --------------------\n");
		ip2.iphone2Info();
		ip2.photos();
		
		System.out.println("-------------------- void type Parameterized Method initialized ---------------\n");
		ip2.iphone2Info('F');
		
		System.out.println("\n************ IPhone6-Regular Class instantiated (Method Overloading) *******************\n");
		// Q:8 Part
		Iphone6 iph6 = new Iphone6();
		iph6.materials();						// void Non parameterized method
		iph6.materials(5, 10);					// Void Parameterized Method		
		iph6.materials(10, "15", 20);			// Void Parameterized Method	
		iph6.materials(5, 10, "15", 20);		// Void Parameterized Method
		Iphone6.materials(7);					// Static method called by class
		iph6.materials(5, 10, 15, 20, "25");	// Return and Final Type method
	
		System.out.println("\n************ ConfiguredIphone6-Regular Class instantiated (Method Overriding) *******************\n");
		
		ConfiguredIphone6 conIph6 = new ConfiguredIphone6();
		conIph6.materials();
		conIph6.materials(10, 20);				// LOGIC CHANGE HERE > +20;
		conIph6.materials(10, "20", 30);		// LOGIC CHANGE HERE > +30;
		conIph6.materials(10, 20, "30", 40);
	//	conIph6.materials(5, 10, 15, 20, "25");	// Final and Return method-Final method can not be Override	
	//	conIph6.materials(8); 					// Static method should called by class name- Static method can not be Override, 
		
		//Q:8 Part
		//Comment: which is hierarchical inheritance, multilevel inheritance, and single inheritance.
		//Answer:
		//Hierarchical inheritance: Iphone2 extends Iphone1; Iphone3 extends Iphone1.
		//Multilevel inheritance: Iphone6 extends Iphone5; Iphone5 extends Iphone4; Iphone4 extends Iphone2; Iphone2 extends Iphone1
		//Single inheritance: ConfiguredIphone6 extends Iphone6
		
	}

}
