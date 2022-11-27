package hw10UseOfSuperInChildClass;

public class Father {

	String Name;
	int age;
	char sex;
	boolean usCitizen;
	String familyName;

	public Father() {
		System.out.println("<---------- Default Constructor ---------->");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("My Name: " + name + "\nI am" + age + "Years Old " + "\n And I am US Ciziten " + usCitizen);
	}

	public void father() {
		System.out.println("<------------- Void Method ------------->");

	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out
				.println("My Name: " + name + "\nI am " + age + " Years Old " + " \nAnd I am US Ciziten " + usCitizen);

	}
}
