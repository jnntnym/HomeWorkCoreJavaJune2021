package hw8Q6Abstraction03;
/*
 * 06) Copy your previous package "hw7Q4Abstraction02" and paste as a new package and rename it to "hw8Q6Abstraction03" inside your HW project and execute the remaining. Read the question very carefully. Create interface VocationalSchool and a method vocationalInfo inside it. Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. See the below inheritance. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool. Paste the github link below.
 */

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n****** Columbia University *******\n");
		ColumbiaUniversity cu = new ColumbiaUniversity(); // Regular class
		cu.aeronauticalInfo();
		cu.anatomyLab();
		cu.biochemistryLab();
		cu.biology();
		cu.cafeteria();
		cu.caring();
		cu.classSize();
		cu.commonRoom();
		cu.computerLab();
		cu.dorm();
		cu.emergencyRoom();
		cu.field();
		cu.gymnasium();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.mechanicalLab();
		cu.morgue();
		cu.physics();
		cu.statistics();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();

		System.out.println("\n****** Rockefeller University *******\n");

		RockefellerUniversity ru = new RockefellerUniversity(); // Regular class
		ru.aeronauticalInfo();
		ru.computerLab();
		ru.mechanicalLab();
		ru.physics();
		ru.statistics();

		System.out.println("\n******* University *******\n");
		/*
		 * Columbia University is a regular class. when A regular class extends one
		 * regular class or abstract class and implements multiple interfaces, that
		 * regular class (Columbia University) is called concrete class. University is
		 * an interface and it can't be instantiated, it needs the help of a concrete
		 * class to create the objects.
		 */
		University uv = new ColumbiaUniversity(); // Interface and Concrete class
		uv.cafeteria();
		uv.classSize();
		uv.commonRoom();
		uv.dorm();
		uv.emergencyRoom();
		uv.field();
		uv.gymnasium();
		uv.laboratory();
		uv.languageClub();
		uv.morgue();
		uv.surgeryRoom();
		uv.teacher();
		University.library(); // Called static method from interface University class by Class name

		System.out.println("\n****** Hospital *******\n");
		/*
		 * Columbia University is a regular class. when A regular class extends one
		 * regular class or abstract class and implements multiple interfaces, that
		 * regular class (Columbia University) is called concrete class. Hospital is an
		 * interface and it can't be instantiated, it needs the help of a concrete class
		 * to create the objects.
		 */
		Hospital hp = new ColumbiaUniversity(); // Interface and Concrete class
		hp.cafeteria();
		hp.emergencyRoom();
		hp.morgue();
		hp.surgeryRoom();
		Hospital.pharmacy(); // Called static method from interface Hospital class by Class name

		System.out.println("\n******* Medical School *******\n");
		/*
		 * Columbia University is a regular class. when A regular class extends one
		 * regular class or abstract class and implements multiple interfaces, that
		 * regular class (Columbia University) is called concrete class. Medical School
		 * is an Abstract class and it can't be instantiated, it needs the help of a
		 * concrete class to create the objects.
		 */
		MedicalSchool ms = new ColumbiaUniversity(); // Abstract Class and Concrete class
		ms.aeronauticalInfo();
		ms.anatomyLab(); 							// Medical school has no static method
		ms.biochemistryLab();
		ms.caring();
		ms.computerLab();
		ms.hygiene();
		ms.mechanicalLab();
		ms.physics();
		ms.statistics();

		System.out.println("\n****** Nursing School *******\n");
		/*
		 * Columbia University is a regular class. when A regular class extends one
		 * regular class or abstract class and implements multiple interfaces, that
		 * regular class (Columbia University) is called concrete class. Nursing School
		 * is an Abstract class and it can't be instantiated, it needs the help of a
		 * concrete class to create the objects.
		 */
		NursingSchool ns = new ColumbiaUniversity(); // Abstract Class and Concrete class
		ns.aeronauticalInfo();						// Nursing school has no static method
		ns.caring();
		ns.computerLab();
		ns.hygiene();
		ns.mechanicalLab();
		ns.physics();
		ns.statistics();

	}

}
