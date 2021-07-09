package hw5Q3variableAndMethod;

public class TestComputer {

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.Brand = "Apple";
		obj.Model = "MacBookAir";
		obj.OperatingSystem = "MacOS Mojave";
		obj.price = 800;
		obj.madeInUSA = false;
		obj.grade = 'A';

		Computer obj1 = new Computer();
		obj1.Brand = "Apple";
		obj1.Model = "MacBookAir";
		obj1.OperatingSystem = "MacOS Big Sur";
		obj1.price = 1600;
		obj1.madeInUSA = true;
		obj1.grade = 'A';

		obj.configuration();
		obj1.configuration1();

	}

}
