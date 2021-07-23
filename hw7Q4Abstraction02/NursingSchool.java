package hw7Q4Abstraction02;

public abstract class NursingSchool {

	abstract void hygiene();

	void caring() {
		System.out.println("This is non abstract caring method from NursingSchool class");
	}

	NursingSchool() { // Yes, We can create a Constructor inside Abstract Class

	}
	
	// HW-07 Starts from below:
		// Comments: (2)
		// Two(2) keywords, “extends” and “implements” are used for the inheritance in Java for Abstract Class
		// YES, By "extends" keyword an Abstract Class can inherit only one other Abstract Class or a regular class but not interface. 
		// By "implements" keyword more than one interface inherit possible in Abstract class
	
}
