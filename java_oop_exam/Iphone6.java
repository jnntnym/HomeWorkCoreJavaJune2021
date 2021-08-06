package java_oop_exam;
/*
 * 06) NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. in 2002, Iphone4 come into the market which inherits Iphone2. in 2003, Iphone5 come into the market which inherits Iphone4. In 2004, Iphone6 come into the market which inherits Iphone5. Consider all of them as a regular class and write a method inside them related to one of the features like ---- map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to 780$"), youtube, dropbox, photos, email, compass, etc (6 methods for 6 class). What kind of concept you can use to relate to them? Instantiate Iphone6 and show how many methods they can call in TestPhone. [points: 70] .
 */
/*
 * 08) Now, Think about Iphone6. It also has 5 methods with the same name as materials(). For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you use the void, parameterized, final, or static method here as the same method name? if yes, create them and take more int variable of your own. What kind of concept you can use? [points: 70]. Instantiate the class in TestPhone and initialize those methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those methods and change the logic at your own to show the changes. [points: 50]. Show the output in TestPhone. [points: 50]. Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance. [points: 50].

 */
public class Iphone6 extends Iphone5 {
	int ramPrice;
	int cameraPrice;
	String ProcessorPrice;
	int height;
	int weight;
	
	// Q:6 Part
	public void dropbox() {
		System.out.println("Dropbox is introduce in Iphone5.");
	}
	
// Q:8 Part
/*
 * Q: Can you use the void, parameterized, final, or static method here as the same method name?
 * Answer: Yes, We can create the void, parameterized, final, or static method here as the same method name.
 * 
 * Q:What kind of concept you can use?
 * Answer: We use Method Overloading Concept here(Polymorphisom)
 * 
 */
	public void materials() {
		System.out.println("This is void type non parameterzed method-1");
		
	}
	public void materials(int ramPrice, int cameraPrice) {
		this.ramPrice = ramPrice;
		this.cameraPrice = cameraPrice;
		System.out.println("This is void type parameterzed method-2");
		System.out.println("Iphone6: "+"Ram Price is: "+ramPrice+" and Camera  Price is: "+cameraPrice);
		
	}
	
	public void materials(int cameraPrice, String ProcessorPrice, int ramPrice) {
		this.cameraPrice = cameraPrice;
		this.ProcessorPrice = ProcessorPrice;
		System.out.println("This is void type parameterzed method-3");
		System.out.println("Iphone6: "+"Ram Price is: "+ramPrice+" , Camera Price is: "+cameraPrice+" ,Processor Price is:"+Integer.parseInt(ProcessorPrice));
		
	}
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice, int height) {
		this.ramPrice = ramPrice;
		this.cameraPrice = cameraPrice;
		this.ProcessorPrice = ProcessorPrice;
		this.height= height;
		System.out.println("This is void type parameterzed method-4");
		System.out.println("Iphone6: "+"Ram Price is: "+ramPrice+" , Camera  Price is: "+cameraPrice+" ,Processor Price is:"+Integer.parseInt(ProcessorPrice)+" Height is: "+height);
		
	}
	public static void materials(int height) {							// Static Method 
		int ip6Height = height;											// this. keyword will error here
		System.out.println("This is void type Static method-5");
		System.out.println("Iphone6: "+"Height is:"+ip6Height);
		
	}
	
	public final int materials(int height, int weight, int ramPrice, int cameraPrice, String ProcessorPrice ) {	// Return type Final Method
		int ip6Feature = height+weight+ramPrice+cameraPrice+Integer.parseInt(ProcessorPrice);
		System.out.println("This is Return type Final method-6");
		System.out.println("Iphone6 featured value is: "+ip6Feature);
		return ip6Feature;
	}
	
}
