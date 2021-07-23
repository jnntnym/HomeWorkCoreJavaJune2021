package hw7Q3Encapsulation01;
/*
 * 03) (paste the question between package and class by multiple line comment). Create a package name "hw7Q3Encapsulation01" in the HW project. Inside the package, a) Create a class, Employee. declare some private variable----> Name, age, sex, usCitizen. How can you access those variables by getter and setter method? Please execute those variables and print Employee info. Paste the GitHub link below.
 */

public class Employee {
	private String Name;
	private int age;
	private char sex;
	private boolean usCitizen;

	// We can generate Getters and Setters method by selecting Private variables then source in a same class and from main method, we can set then get it.
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
