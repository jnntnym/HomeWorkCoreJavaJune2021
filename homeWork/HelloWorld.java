package homeWork;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Everyone!");
		System.out.println("This is 1st github commit");
		System.out.println("This is 2nd github commit");
		System.out.println("This is 3rd github commit");
		System.out.println("This is new\nline example");
		System.out.println("This is backspace\b example");
		System.out.println("This is tab\texample");
		System.out.println("This is \rcarriage return example");
		System.out.println("This is \"inside double quotation\" example");
		System.out.println("This is \'inside single quotation\' example");
		// important interview question: Can you call a non static variable or method inside main method?
		//Ans: Non static variable (or non-static method) can't call inside a static method.
		
		/*
		 * 	this is the answer of that interview question: if static is not allowed to put outside the main method with
		 *  variables, what would be the solution?
		 *  
		 *  if variable is inside the main method they must be non-static
		 *  static variables can't executed inside main method, they must be non static
		 * */

	}

}
	 