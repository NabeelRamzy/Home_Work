package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity implements LawSchool {

	public abstract void hygiene();

	public void caring() {
		System.out.println("Caring form Nursing School Class");
	}

}
