package hw9Q3Polymorphism;

public class Niece extends Sister{

	// Void type non Parameterized Method
	@Override
	public void ageOfSisters() {
}
	// Void type Parameterized Method
	@Override
	public void ageOfSisters(int age1, int age2, int age3) {
		int totalAge = age1 +age2+ age3;
		System.out.println("This is void type parameterized method");
		System.out.println("Total age is: "+totalAge);
	}
	// Return type Parameterized Method
	@Override
	public int ageOfSisters(int age1, int age2, int age3, String age4 ) {
		int totalAge1 = age1+ age2+ age3+ Integer.parseInt(age4);
		System.out.println("This is Return type parameterized method"+totalAge1);
		return totalAge1;
	}
	
/*	
	// Static method can not be Override, but if you remove @Override 
	@Override
	public static void ageOfSisters(int age3, int age2) {			
		int totalAge2 = age3+ age2;									
		System.out.println("This is void Static type Parameterized method");		
		System.out.println("Total age is: "+totalAge2);
	}
*/
	// Static method can not be Override, but if you remove @Override then it will work
	public static void ageOfSisters(int age3, int age2) {			
		int totalAge2 = age3+ age2;									
		System.out.println("This is void Static type Parameterized method");		
		System.out.println("Total age is: "+totalAge2);
	}
	
/*
// Final method can not be Override	
	@Override
	public final int ageOfSisters(int age1, int age2, int age3, int age5, int age6) {
		int totalAge3 = age1+  age2+  age3+  age5+ age6;
		System.out.println("This is Return and final type Parameterized method");
		System.out.println("Total age is: "+totalAge3);
		return age6;
	}
*/
	
}
