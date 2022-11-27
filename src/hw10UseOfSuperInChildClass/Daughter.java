package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	String birthMonth;
	int age;

	public Daughter() {
		super(); // super method default constructor from parent class
		super.father();
		super.fatherInfo("Jay", 20, 'M', true);// parameterized method initialized
		super.familyName = "PARASITES"; // variable is initialized from super class in sub class

		System.out.println("<------------------ Default Constructor --------------------->");

	}

	public Daughter(String birthMonth, int age) {
		super("Sony", 23, 'M', false); // parameterized initialized from super class
		super.father();
		super.fatherInfo("Jenny", 45, 'F', true);
		super.familyName = "Khan";

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("I was born In  " + birthMonth + "\nAnd MY Age is " + age);
	}

	public void daughter() {
		// super(); // we can't call constructor of super class inside a method of child
		// class.

		super.father();
		super.fatherInfo("Jhon", 30, 'M', false);
		super.familyName = "Lucas";
		System.out.println("<---------------- Void Method ----------------------->");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.familyName = "Riz";
		super.fatherInfo("Nish", 28, 'M', true);
		super.father();

		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("\nI was born In  " + birthMonth + "\nAnd MY Age Is " + age);

	}

}
