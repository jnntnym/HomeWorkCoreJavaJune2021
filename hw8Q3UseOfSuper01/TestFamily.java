package hw8Q3UseOfSuper01;

public class TestFamily {

	public static void main(String[] args) {
		
		// Father Class Initialized
		System.out.println("-------------------- Default Constructor initialized -------------------------\n");
		Father ftr = new Father();
		
		System.out.println("-------------------- Parameterized Constructor initialized --------------------\n");
		Father ftr1 = new Father("Karim", 60, 'M', false);
		
		System.out.println("-------------------- void type Regular Method  initialized --------------------\n");
		ftr.father();
		
		System.out.println("-------------------- void type Parameterized Method initialized ---------------\n");
		ftr.fatherInfo("Karim1", 61, 'M', true);
		
		// Son Class Initialized
		System.out.println("-------------------- Default Constructor initialized -------------------------\n");
		Son sn = new Son();
		
		System.out.println("-------------------- Parameterized Constructor initialized --------------------\n");
		Son sn1 = new Son(777, 'A');
		
		System.out.println("-------------------- void type Regular Method  initialized --------------------\n");
		sn.son();
		
		System.out.println("-------------------- void type Parameterized Method initialized ---------------\n");
		sn.sonInfo(888, 'B');
		
		// Call Father Class void type Method
		System.out.println("-------------------- Father Class void type Method initialized-----------------\n"); 
		sn.father();

		// Call Father Class Parameterized Method
		System.out.println("-------------------- Father Class Parameterized Method initialized---------------\n");
		sn.fatherInfo("Karim2", 62, 'M', false);
		
	}

}
