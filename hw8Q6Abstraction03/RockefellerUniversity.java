package hw8Q6Abstraction03;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{

//	abstract void maths(); // Abstract method allowed only in Abstract class

	public void statistics() {
		System.out.println("This is non abstract method statistics from RockefellerUniversity regular class");
	}

	public RockefellerUniversity() { // Yes, we can create a Constructor inside a regular class
		System.out.println("This is Constructor from Rockefeller University Regular Class");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("Aeronautical University>@Override>Rockefeller University>");
		
	}

	@Override
	public void mechanicalLab() {
		System.out.println("Engineering School>@Override>Rockefeller University>");
		
	}
	
	// HW-07 starts below:
			// Comments: (3)
			// Two (2) keywords are used for the inheritance in Java for a regular Class by "extends" and  by "implements"
			// YES, a Regular Class can inherit other Abstract Class or a regular class or interface.
			// By "extends" keyword a Regular Class can inherit only one other Abstract Class or only one Regular class but not interface. 
			// By "implements" keyword more than one interface inherit possible in Regular class

}
