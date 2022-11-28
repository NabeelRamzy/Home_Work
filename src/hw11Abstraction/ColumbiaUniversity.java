package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// public abstract void chemistry();

	/*
	 * A Concrete class Methods only implemented but not declared Abstract method
	 * can not be implemented, can be defined (declared) only
	 */

	public void biology() {
		System.out.println("Biology from Columbia University Class");
	}

	public ColumbiaUniversity() {
		System.out.println("Yes Construtor from Cloumbia University");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	public static void columbiaUniversity() {
		System.out.println("Static Method From COLUMBIA UNIVERSITY ----->");

	}

	// public default void ColumbiaInfo() {
	// default method not allowed in regular class
	// }

	/*
	 * ANSWER:---------->
	 * 
	 * In regular class to inherit two keywords are used one is "extends" keyword is
	 * used to inherit only one Regular class or one Abstract class & "implements"
	 * keyword is only used to inherit interface class also can be inherit more then
	 * one class
	 * 
	 * By "Extend" keyword cannot inherit interface In Regular class
	 * 
	 */

}
