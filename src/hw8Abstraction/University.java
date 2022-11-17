package hw8Abstraction;

public interface University {

	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * An Interface in Java doesn't have a constructor because all data members in
	 * interfaces are public static final by default, they are constants (assign the
	 * values at the time of declaration). There are no data members in an interface
	 * to initialize them through the constructor
	 */
	// public University () {
	// System.out.println("Constructor Cannot be created");
//	}

}
