package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		System.out.println("<------------------- Regular Class ------------------->");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();

		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.dorm();
		columbiaUniversity.computerLab();
		ColumbiaUniversity.columbiaUniversity(); // static method
		ColumbiaUniversity.medischool(); // static method from Abstract class

		System.out.println("<------------------ Interface Class  ------------------>");

		// interface can't be instantiated, it needs the help of a concrete class
		University university = new ColumbiaUniversity();

		university.gymnasium();
		university.dorm();
		university.classSize();
		university.playGround();
		university.emergencyRoom();
		university.commonRoom();
		university.cafeteria();
		university.teacher();
		University.universityInfo(); // static method
		University.library();

		System.out.println("<----------------- Abstract Class --------------------->");

		// Cannot instantiate the type MedicalSchool because
		// an abstract class can't be instantiated, it needs the help of a concrete
		// class,

		MedicalSchool medicalSchool = new ColumbiaUniversity();

		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.aeronauticalInfo();
		medicalSchool.anthropology();
		medicalSchool.caring();
		medicalSchool.computerLab();
		medicalSchool.lawInfo();
		medicalSchool.lawInfo();
		MedicalSchool.medischool(); // static method

	}

}
