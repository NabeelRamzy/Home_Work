package hw3JavaVariables;

public class AboutMe {

	int x; // variable Declaration

	public String myname = "Nabeel"; // variable initialization
	public char gender = 'M';
	public byte age = 29;
	public int height = 180;
	public short myHouseRent = 2000;
	public long mySalary = 75000l;
	public float expectatedSalary = 250.000000000f;
	public double bankBalance = 34.58698438083058389;
	public boolean sriLankan = true;

	public static void main(String[] args) {

		AboutMe myInfo = new AboutMe(); // instantiation

	
	 	System.out.println("Name :" + myInfo.myname + ", Age :" + myInfo.age + ", Height :" + myInfo.height
 
				+ ", Srilankan ;" + myInfo.sriLankan); // concatenation

	}

}
