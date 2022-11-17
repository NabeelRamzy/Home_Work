package hw8Abstraction;

public abstract class MedicalSchool {
	// Abstraction Method
	public abstract void anatomyLab();

	// non Abstraction Method
	public void biochemistryLab() {
		System.out.println("Biochemistry Lab from Medical School Class");
	}

	public MedicalSchool() {
		System.out.println("YES! Constructor is from Medical School Class");
	}
}
