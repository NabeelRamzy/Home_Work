package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

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
