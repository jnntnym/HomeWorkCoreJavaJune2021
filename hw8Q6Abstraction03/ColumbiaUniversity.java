package hw8Q6Abstraction03;
/*
 * 04) (Paste the question between package and class by multiple line comment). (From HW 06) Copy your previous package "hw6Q4Abstraction01" and rename it to "hw7Q4Abstraction02" inside your HW project and execute the remaining. Read the question very carefully. i) Create one default and one static method gymnasium and library inside interface "University". Create one default and one static method morgue and pharmacy inside interface "Hospital". Create also one default and one static method dorm and studyRoom inside interface "College". How many keywords are used for the inheritance in Java? how many keywords are used for the inheritance in Interface, answer by Java comments? if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions. ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions. iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? Can an regular Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by a regular Class? Use the all of above regular Classes and use the keywords to answer my questions. You don't need to execute anything as the main method is absent. Paste your Abstraction github link below

 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// abstract void chemistry(); //Only abstract class allowed the abstract method

	public void biology() {
		System.out.println("This is non abstract method biology from ColumbiaUniversity regular class");
	}

	public ColumbiaUniversity() { // Yes, we can create a Constructor inside a regular class
		System.out.println("This is Constructor from Columbia university Regular Class");
	}

	@Override
	public void commonRoom() {
		System.out.println("College>@Override>Columbia University>");
		
	}

	@Override
	public void laboratory() {
		System.out.println("College>@Override>Columbia University>");
		
	}

	@Override
	public void languageClub() {
		System.out.println("College>@Override>Columbia University>");
		
	}

	@Override
	public void emergencyRoom() {
		System.out.println("Hospital>@Override>Columbia University>");
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("Hospital>@Override>Columbia University>");
		
	}

	@Override
	public void cafeteria() {
		System.out.println("Hospital>@Override>Columbia University>");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("VocationalSchool>@Override>Columbia University>");
		
	}

	@Override
	public void classSize() {
		System.out.println("University>@Override>Columbia University>");
		
	}

	@Override
	public void field() {
		System.out.println("University>@Override>Columbia University>");
		
	}

	@Override
	public void teacher() {
		System.out.println("University>@Override>Columbia University>");
		
	}

	@Override
	public void anatomyLab() {
		System.out.println("Medical School>@Override>Columbia University>");
		
	}

	@Override
	public void hygiene() {
		System.out.println("Nursing School>@Override>Columbia University>");		
	}

	// HW-07 starts below:
		// Comments: (3)
		// Two (2) keywords are used for the inheritance in Java for a regular Class by "extends" and  by "implements"
		// YES, a Regular Class can inherit other Abstract Class or a regular class or interface.
		// By "extends" keyword a Regular Class can inherit only one other Abstract Class or only one Regular class but not interface. 
		// By "implements" keyword more than one interface inherit possible in Regular class
			
}
