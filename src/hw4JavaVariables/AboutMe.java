package hw4JavaVariables;

public class AboutMe {

	// variables Declared

	public String myname;
	public char gender;
	public byte age;
	public int height;
	public short myHouseRent;
	public long mySalary;
	public float expectatedSalary;
	public double bankBalance;
	public boolean sriLankan;

	public AboutMe() { // Constructor declared
		System.out.println("This is all about us: ");
	}

	public void aboutme() { // Method Implemented
		System.out.println("My Name: " + myname + ", My Age: " + age + ", My Sex: " + gender + "\nMy Height" + height
				+ "\nI am Sri Lankan" + sriLankan);
	}
}
