package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	// Abstraction Method
	public abstract void anatomyLab();

	// non Abstraction Method
	public void biochemistryLab() {
		System.out.println("Biochemistry Lab from Medical School Class");
	}

	public MedicalSchool() {
		System.out.println("YES! Constructor is from Medical School Class");
	}

	/*
	 * ANWER: ------------->
	 * 
	 * In Abstract class two keywords are used one is "extends" keyword is used to
	 * inherit only one Abstract class or one regular class & "implements" keyword
	 * is only used to inherit interface class also can be inherit more then one
	 * class
	 * 
	 * Interface cannot be inherit By "Extend" keyword. In Abstract class
	 */

}
