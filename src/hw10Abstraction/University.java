package hw10Abstraction;

public interface University extends College, Hospital {

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

	public default void gymnasium() {

	}

	public static void library() {

	}

	/*
	 * ANSWER:---------->
	 * 
	 * In interface only "extends" keyword can be used To inherit Interface classes
	 * only. And Interface class can be inherit more then one class. Abstract class
	 * or Regular class cannot be inherited by Using "extend" keyword and
	 * "implements" keyword is not allowed in Interface class
	 *
	 * 
	 */

}
