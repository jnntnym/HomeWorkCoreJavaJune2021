package hw9Q3Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n ******** Method Overloading **********\n");
		
		Sister st  = new Sister();
		st.sister(); 						// Void type
		st.ageOfSisters();					// Public void type
		st.ageOfSisters(5, 10, 15);			// Void type Parameterized Method
		st.ageOfSisters(5, 10, 15, "20");	// Return type Parameterized Method
		st.ageOfSisters(5, 10, 15, 20, 25);	// Final type method
		Sister.ageOfSisters(10, 20);		// Static method called by Class name-static way
		
		System.out.println("\n ******** Method Overriding  **********\n");
		
		Niece nc =new Niece();
		nc.sister();						// Void type
		nc.ageOfSisters();					// Sister-void type
		nc.ageOfSisters(10, 15, 20);		// Void type Parameterized Method
		nc.ageOfSisters(10, 15, 20, "25");	// Return type Parameterized Method
		nc.ageOfSisters(10, 15, 20, 25, 30);// Final type method
		Niece.ageOfSisters(15, 25);			// Static method called by Class name-static way
	}

}
