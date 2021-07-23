package hw7Q3Encapsulation01;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Nayeem");		// Set the value
		employee.setAge(33);
		employee.setSex('M');
		employee.setUsCitizen(false);

		System.out.println("Employee info:");	// get the value
		System.out.println("Name: " + employee.getName() + ", \nAge: " + employee.getAge()
				+ ", \nSex: " + employee.getSex() + ", \nisUSCitizen: " + employee.isUsCitizen());

	}

}
