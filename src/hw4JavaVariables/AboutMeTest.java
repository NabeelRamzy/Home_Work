package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe me = new AboutMe(); // Constructor initialized

		// Variables initialized
		me.myname = "Nabeel";
		me.gender = 'M';
		me.age = 29;
		me.height = 180;
		me.mySalary = 5000000l;
		me.myHouseRent = 3000;
		me.expectatedSalary = 2000000000000f;
		me.bankBalance = 1294858584;
		me.sriLankan = true;

		System.out.println("My Name is :" + me.myname + "\nMy Sex:" + me.gender + "\nMy Height:" + me.height
				+ " \nMy Incom:" + me.mySalary + "\nThe Income i expect:" + me.expectatedSalary
				+ "\nMy bank balance is:" + me.bankBalance + "\nIam not a Srilankan:" + me.sriLankan);

		System.out.println("\n--------------------------------------------------------------");

		AboutMe alex = new AboutMe();

		alex.myname = "Alex";
		alex.gender = 'M';
		alex.height = 177;
		alex.mySalary = 43874647397l;
		alex.myHouseRent = 4500;
		alex.expectatedSalary = 23489778634f;
		alex.bankBalance = 1073846;
		alex.sriLankan = true;
         String tring = "String";
		System.out.println("My Name is :" + alex.myname + " \nMy Sex :" + alex.gender + "\nMy Height:" + alex.height
				+ " \nMy Incom:" + alex.mySalary + "\nThe Income i expect:" + alex.expectatedSalary
				+ "\nMy bank balance is:" + alex.bankBalance + "\nIam not a Srilankan:" + alex.sriLankan);

	}

}
