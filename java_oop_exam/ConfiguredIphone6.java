package java_oop_exam;
/*
 * 08) Now, Think about Iphone6. It also has 5 methods with the same name as materials(). For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you use the void, parameterized, final, or static method here as the same method name? if yes, create them and take more int variable of your own. What kind of concept you can use? [points: 70]. Instantiate the class in TestPhone and initialize those methods. [points: 70]. Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those methods and change the logic at your own to show the changes. [points: 50]. Show the output in TestPhone. [points: 50]. Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance. [points: 50].
 */

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public void materials() {
		System.out.println("This is void type non parameterzed @Override method-1");

	}

	@Override
	public void materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice + 20; // LOGIC CHANGE HERE > +20;
		System.out.println("This is void type parameterzed @Override-2");
		System.out
				.println("ConfiguredIphone6: " + "Ram Price is: " + ramPrice + " and Camera  Price is: " + cameraPrice);
		System.out.println("LOGIC CHANGE HERE > +20, Total: " + total1);
	}

	@Override
	public void materials(int cameraPrice, String ProcessorPrice, int ramPrice) {
		int total2 = cameraPrice + 30 + Integer.parseInt(ProcessorPrice) + ramPrice; // LOGIC CHANGE HERE > +30;
		System.out.println("This is void type parameterzed @Override-3");
		System.out.println("ConfiguredIphone6: " + "Ram Price is: " + ramPrice + " , Camera Price is: " + cameraPrice
				+ " ,Processor Price is:" + Integer.parseInt(ProcessorPrice));
		System.out.println("LOGIC CHANGE HERE > +30, Total: " + total2);

	}

	@Override
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice, int height) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + height;
		System.out.println("This is void type parameterzed method-4");
		System.out.println("ConfiguredIphone6: " + "Ram Price is: " + ramPrice + " , Camera  Price is: " + cameraPrice
				+ " ,Processor Price is:" + Integer.parseInt(ProcessorPrice) + "Height is: " + height);
		System.out.println("ConfiguredIphone6 Total: " + total3);
	}

// Static method can not be Override, but if you remove @Override then it will work
	/*
	 * @Override public static void materials(int height) { // Static Method int
	 * ip6Height = height; // this. keyword will error here
	 * System.out.println("This is void type Static method-5");
	 * System.out.println("ConfiguredIphone6: "+"Height is:"+ip6Height);
	 * 
	 * }
	 */

// Final method can not be Override	
	/*
	 * @Override public final int materials(int height, int weight, int ramPrice,
	 * int cameraPrice, String ProcessorPrice ) { // Return type Final Method int
	 * ip6Feature =
	 * height+weight+ramPrice+cameraPrice+Integer.parseInt(ProcessorPrice);
	 * System.out.println("This is Return type Final method-6");
	 * System.out.println("ConfiguredIphone6 featured value is: "+ip6Feature);
	 * return ip6Feature; }
	 */

}
