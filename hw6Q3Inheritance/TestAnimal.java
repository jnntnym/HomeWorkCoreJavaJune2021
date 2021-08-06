package hw6Q3Inheritance;

/*
 * 03) (Paste the complete question between package and class by multiple line comments.). Create a package name "hw6Q3Inheritance" in HW project. Inside the package, a) Create a class "Animal". Implement a method inside the class -- animalInfo and System.out.println("This method is from Animal Class"). b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class"). c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class"). d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class"). e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class"). f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class"). g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class"). h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class"). i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class"). Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object. Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class. Organize the code. Push the code in Github. Paste your github link below.
 */
public class TestAnimal {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("*************");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo(); // Possible calls
		System.out.println("*************");

		BullDog bulldog = new BullDog(); // BullDog -- Dog -- Mammal --Animal
		bulldog.bullDogInfo();
		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();
		System.out.println("*************");

		Cobra cobra = new Cobra(); // Cobra -- Snake--Reptile--Animal
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("*************");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Possible calls
		dog.animalInfo(); // Possible calls
		System.out.println("*************");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Possible calls
		System.out.println("*************");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo(); // Possible calls
		System.out.println("*************");

		Robin robin = new Robin(); // Robin -- Birds -- Animal
		robin.robinInfo();
		robin.birdsInfo(); // Possible calls
		robin.animalInfo(); // Possible calls
		System.out.println("*************");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo(); // Possible calls
		snake.animalInfo(); // Possible calls

		/*
		 * COMMENTS: 
		 * 1. Mammal extends Animal; Reptile extends Animal; Birds extends Animal >> they are called 'Multilevel inheritance'  
		 * 2. Robin extends Birds; Birds extends Animal >> they are called ' Hierarchical' inheritance' 
		 * 3. BullDog extends Dog; OR Cobra extends Snake >> this is called 'Single' inheritance 
		 * 4. Animal is a Parent class and Mammal , Reptile and Birds is a Child class of
		 * Parent Class(Animal).
		 */
	}

}
