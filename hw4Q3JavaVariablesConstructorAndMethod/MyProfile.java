package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
	
	String 	MyName;	// we can use the same variables to initialize value for multiple data set
	int 	myAge;
	char 	mySex;
	boolean usaCitizen;
	byte 	myExp;
	short	carIns;
	long 	mySalary;
	float 	myGrade;
	double 	myHeight;
	
	public MyProfile() { 		// Constructor declared
		System.out.println("This is default Constructor declared");
		
	}
	
	public void myProfile() {	// method implemented
		System.out.println("My name is :"+MyName+ "\n"+"Age is :"+myAge+"\n"+"Sex is :"+mySex+"\n"+ "USA Citizen :"+usaCitizen+"\n"+"Experiance :"+myExp+ "\n"+"Car Ins :"+carIns+ "\n"+"Salary is :"+mySalary+ "\n"+ "Grade is :"+myGrade+"\n"+"Height is :"+myHeight);
		
	}
	
//	The below code can also be used here, but it is better to create another Class for main method
	
//	public static void main(String[] args) {
//		
//		MyProfile nayeem = new MyProfile();	// MyProfile Class is instantiated here by creating an object, actually default constructor is initialized
//
//		nayeem.MyName	= "Nayeem";
//		nayeem.myAge	= 123;
//		nayeem.mySex	= 'M';
//		nayeem.usaCitizen = false;
//		nayeem.myExp	= 5;
//		nayeem.carIns 	= 200;
//		nayeem.mySalary= 123456l;
//		nayeem.myGrade	= 3.25f;
//		nayeem.myHeight= 1.234567;
//		
//		MyProfile jony = new MyProfile();	// MyProfile Class is instantiated here by creating an another object
//		
//		jony.MyName	= "Jony";
//		jony.myAge	= 150;
//		jony.mySex	= 'M';
//		jony.usaCitizen = true;
//		jony.myExp	= 7;
//		jony.carIns 	= 250;
//		jony.mySalary= 13456l;
//		jony.myGrade	= 3.75f;
//		jony.myHeight= 1.23456789;
//		
//		nayeem.myProfile();					// object is used to call the method, when the class don't need to be static	
//		System.out.println("**********");
//		jony.myProfile();			
//		
//	}

}
