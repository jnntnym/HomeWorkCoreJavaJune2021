package hw9Q3Polymorphism;

public class Sister {
	int age1;
	int age2;
	int age3; 
	String age4;
	int age5;
	int age6;
	
	public void sister() {
		System.out.println("This is void type sister() method");
	}
/*	
* public void sister() {	// No, we can't create several non parameterized methods with the same name inside it
*		System.out.println("This is void type sister() method");
*	}
*/	
	
// Void type/no return type Non-Parameterized Method
	public void ageOfSisters() {
		System.out.println("This is void type non parameterized method");
	}
	
// Void type/ no return type Parameterized Method
	public void ageOfSisters(int age1, int age2, int age3) {
		int totalAge = age1 +age2+ age3;
		System.out.println("This is void type parameterized method");
		System.out.println("Total age is: "+totalAge);
	}
	
// Return type Parameterized Method
	public int ageOfSisters(int age1, int age2, int age3, String age4 ) {
		int totalAge1 = age1+ age2+ age3+ Integer.parseInt(age4);
		System.out.println("This is Return type parameterized method"+totalAge1);
		return totalAge1;
	}
	
// Static method can be overloaded
	public static void ageOfSisters(int age3, int age2) {			// Why this Error? Parameter and method type is different here!!
		int totalAge2 = age3+ age2;									//  Same number of parameter will show Error??
		System.out.println("This is void Static type Parameterized method");		
		System.out.println("Total age is: "+totalAge2);
	}
	
// Final method can be overloaded	
	public final int ageOfSisters(int age1, int age2, int age3, int age5, int age6) {
		int totalAge3 = age1+  age2+  age3+  age5+ age6;
		System.out.println("This is Return and final type Parameterized method");
		System.out.println("Total age is: "+totalAge3);
		return totalAge3;
	}
	
// What is method Overloading:
	//When different methods exist with the same method name but with different number of parameters with different combination of variables or signature, is called method overloading. 
	//Method Overloading occurs during compile time. it's also known as Static Polymorphism or early binding.
}
