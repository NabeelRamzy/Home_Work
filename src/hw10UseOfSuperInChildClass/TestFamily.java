package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("<-------- Default constructor initialized from Daughter Class ----->  ");
		Daughter daughter = new Daughter();

		System.out.println("<------- parameterized constructor -------------->");
		Daughter daughter1 = new Daughter("October", 29);

		System.out.println("<------- Void Type Method intialized ----------->");
		daughter1.daughter();

		System.out.println("<---------- parameterized Method ------------->");
		Daughter daughter2 = new Daughter("December", 22);

		System.out.println("<--------- Default constructor initialized from Father Class");
		Father father = new Father();

		System.out.println("<-------- parameterized constructor --------------->");
		Father father1 = new Father("Aryan", 25, 'M', false);

		System.out.println("<--------- Void Method intialized --------------->");
		father1.father();

		System.out.println("<----------- parameterized Method ------------------>");
		Father father3 = new Father("Lisa", 27, 'F', true);

	}
}