package hw8Q6Abstraction03;

	public abstract class NursingSchool extends RockefellerUniversity {

	public abstract void hygiene();

	public void caring() {
		System.out.println("This is non abstract caring method from NursingSchool class");
	}

	public NursingSchool() { // Yes, We can create a Constructor inside Abstract Class
		System.out.println("This is Constructor from Nursing School Abstract Class");
	}
	
	// HW-07 Starts from below:
		// Comments: (2)
		// Two(2) keywords, “extends” and “implements” are used for the inheritance in Java for Abstract Class
		// YES, By "extends" keyword an Abstract Class can inherit only one other Abstract Class or a regular class but not interface. 
		// By "implements" keyword more than one interface inherit possible in Abstract class
	
}
