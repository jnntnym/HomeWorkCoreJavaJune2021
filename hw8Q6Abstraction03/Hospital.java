package hw8Q6Abstraction03;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	/*
	 * Hospital(){ // Interfaces cannot have Constructors
	 * 
	 * }
	 */

// HW-07 starts below:
	
	public default void morgue() {	// from java 1.8, default  method is allowed
		System.out.println("Morgue default method from Interface Hospital");
	}
	
	public static void pharmacy() {	// from java 1.8, static  method is allowed
		System.out.println("Pharmacy static method from Interface Hospital");
	}
	// HW: 07 Comments:(1)
		// Two(2) keywords, “extends” and “implements” are used for the inheritance in Java.
		// One (1) keyword "extends" used for the inheritance in in Interface.
		// We can not use the keyword 'implements' in Interface, because it shows Syntax error on token "implements", extends expected.

}
