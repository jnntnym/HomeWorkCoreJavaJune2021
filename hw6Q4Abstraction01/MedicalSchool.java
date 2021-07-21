package hw6Q4Abstraction01;

public abstract class MedicalSchool {

	abstract void anatomyLab();

	void biochemistryLab() {
		System.out.println("This is non abstract biochemistryLab method from MedicalSchool Class");

	}

	MedicalSchool() { // Yes, We can create a Constructor inside Abstract Class

	}

// One keyword : extends is the keyword used to inherit the properties of a class.

// Yes, An Abstract class can inherit Regular class OR Abstract class. But, Abstract class can't inherit any Interface.

// Only one Regular class OR only one Abstract class inheritances is possible by an Abstract Class.

}
