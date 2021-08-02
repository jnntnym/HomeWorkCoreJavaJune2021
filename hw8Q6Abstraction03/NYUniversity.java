package hw8Q6Abstraction03;

public class NYUniversity {

	// abstract void anthropology(); // Abstract method allowed only in Abstract class

	public void physics() {
		System.out.println("This is non abstract method physics from NYUniversity regular class");
	}

	public NYUniversity() { // Yes, we can create a Constructor inside a regular class
		System.out.println("This is Constructor from NY University Regular Class");
	}

	// HW-07 starts below:
			// Comments: (3)
			// Two (2) keywords are used for the inheritance in Java for a regular Class by "extends" and  by "implements"
			// YES, a Regular Class can inherit other Abstract Class or a regular class or interface.
			// By "extends" keyword a Regular Class can inherit only one other Abstract Class or only one Regular class but not interface. 
			// By "implements" keyword more than one interface inherit possible in Regular class
				
}
