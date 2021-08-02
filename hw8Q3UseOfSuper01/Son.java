package hw8Q3UseOfSuper01;
/*
 * 03) Create a package name "hw8Q3UseOfSuper01" in the HW project. Inside the package, a) Create a class name Father. declare some variable like Name, age, sex, usCitizen, FamilyName. Declare default and parameterized constructor from the first 4 variables. Use FamilyName variable for use by super keyword. Create a regular void method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout b) Create a class name Son, declare variable Id, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. Son extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class. Paste GitHub link below.
 */

public class Son extends Father{
	
	int id;
	char grade;
	
	public Son() {
		super();		// Either default or parameterized constructor can be called, here default
		super.father();	// super keyword is used to call the regular methods of Parent class
		super.fatherInfo("Jannat", 101, 'B', true);	// super keyword is used to call the parameterized methods of Parent class
		System.out.println("This is default Constructor");
	}

	public Son(int id, char grade) {
		super("Nayeem", 103, 'A', false);	// Either default or parameterized constructor can be called, here Parameterized
		
		super.Name ="John Doe";				// super key word can call the declared/initialized variable of the super class.
		super.age=30;
		super.sex='M';
		super.usCitizen=true;
		super.FamilyName = "Jony";
		System.out.println("Name: "+Name+" Age :"+age+" Sex: "+sex+ " isUSCitizen?: "+usCitizen+" FamilyName: "+FamilyName);  // After initialize by super key word, here we print 
		
		this.id = id;		// line 15
		this.grade = grade;	// line 15
		System.out.println("ID: "+id+" Grade: "+grade);	// line 15
		
		System.out.println("This is Parameterized Constructor of Son Class"); // line 15
		
	}
	
	public void son() {
	//	super();	// here error- we can't call constructor or parameterized constructor of super class inside a method of child class, but we can call variable or methods of Parent class
	//	super("Nayeem1", 104, 'C', false);	
		System.out.println("This is regular void type method of son class");
	}
	
	public void sonInfo(int id, char grade) {
		super.fatherInfo("Kazi", 1234, 'D', true);	// We can call variable or methods of Parent class, here parameterized methods
		
		this.id = id;		// Line 39
		this.grade = grade;	// Line 39
		System.out.println("ID: "+id+" Grade: "+grade);// Line 39
		System.out.println("This is Parameterized sonInfo method of son class");
	}

}
