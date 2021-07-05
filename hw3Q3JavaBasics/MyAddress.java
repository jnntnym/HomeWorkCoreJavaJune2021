package hw3Q3JavaBasics;

/*
My Address Information (Expected Outcome)
Jannat U Nayeem 
88,Van Reypen Street
5J,New Jersey
Jersey City,NJ-07306,USA 
* 
* */
public class MyAddress {
	static String myName = "Jannat U Nayeem";
	static int houseNumber = 88; // ,
	static String streetName = "Van Reypen"; // Street
	static int aptNumber = 5; // J
	static String stateName = "New Jersey";
	static String cityName = "Jersey City";
	static String cityShortName = "NJ"; // -
	static int cityCode = 7306; // 0 ,
	static String countryName = "USA";

	public static void myAdress() {

		System.out.println("My Address Information");
		System.out.println(myName + " \n" + houseNumber + "," + streetName + " " + "Street\n" + aptNumber + "J" + ","
				+ stateName + "\n" + cityName + "," + cityShortName + "-" + "0" + cityCode + "," + countryName);

	}

	public static void main(String[] args) {

		myAdress();

	}

}
