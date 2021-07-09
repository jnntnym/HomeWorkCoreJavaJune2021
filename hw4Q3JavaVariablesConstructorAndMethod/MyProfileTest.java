package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfileTest {
	
	
	public static void main(String[] args) {
		
		MyProfile nayeem = new MyProfile();	// MyProfile Class is instantiated here by creating an object, actually default constructor is initialized

		nayeem.MyName	= "Nayeem";
		nayeem.myAge	= 123;
		nayeem.mySex	= 'M';
		nayeem.usaCitizen = false;
		nayeem.myExp	= 5;
		nayeem.carIns 	= 200;
		nayeem.mySalary= 123456l;
		nayeem.myGrade	= 3.25f;
		nayeem.myHeight= 1.234567;
		
		MyProfile jony = new MyProfile();	// MyProfile Class is instantiated here by creating an another object
		
		jony.MyName	= "Jony";
		jony.myAge	= 150;
		jony.mySex	= 'M';
		jony.usaCitizen = true;
		jony.myExp	= 7;
		jony.carIns 	= 250;
		jony.mySalary= 13456l;
		jony.myGrade	= 3.75f;
		jony.myHeight= 1.23456789;
		
		nayeem.myProfile();					// object is used to call the method, when the class don't need to be static	
		System.out.println("**********");
		jony.myProfile();			
		
	}

}
