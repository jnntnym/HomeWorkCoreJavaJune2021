package hw8Q3UseOfSuper01;
/*
 * 
 * 03) Create a package name "hw8Q3UseOfSuper01" in the HW project. Inside the package, a) Create a class name Father. declare some variable like Name, age, sex, usCitizen, FamilyName. Declare default and parameterized constructor from the first 4 variables. Use FamilyName variable for use by super keyword. Create a regular void method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout b) Create a class name Son, declare variable Id, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. Son extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class. Paste GitHub link below.
 */

public class Father {
	
	String Name;
	int age;
	char sex;
	boolean usCitizen;
	String FamilyName;
	
	public Father() {
		System.out.println("This is default Constructor from Father class");
		
	}
	
	public Father(String name, int age, char sex, boolean usCitizen) {
		// super.FamilyName;	// Show error because-super keyword is used in child class to inherit from the parent/super class.
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("This is Parameterized Constructor from Father class");
		System.out.println("Name: "+name+" Age :"+age+" Sex: "+sex+ " isUSCitizen?: "+usCitizen);
	}
	
	public void father() {
		System.out.println("This is void method from Father class");
	}
	
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("This is Parameterized method from Father class");
		System.out.println("Name: "+name+" Age :"+age+" Sex: "+sex+ " isUSCitizen?: "+usCitizen);
	}

}
