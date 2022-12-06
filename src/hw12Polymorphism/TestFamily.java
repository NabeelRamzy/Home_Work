package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println(".....................Sister Class .....................");

		Sister sister = new Sister();

		sister.sister(); // void method
		sister.sister(11, 12, 13);
		sister.sister(14, 15);
		sister.sister(16, 17, 18, 19);
		sister.sister(20, 21, "22", 23, 24);
		sister.sister(25, 26, 27, "28", 29, 30);

		System.out.println("...................... Niece Class ..................");

		Niece niece = new Niece();

		niece.sister();
		niece.sister(11, 12, 13);
		niece.sister(14, 15);
		niece.sister(16, 17, 18, 19);
		niece.sister(20, 21, "22", 23, 24);
		niece.sister(25, 26, 27, "28", 29, 30);
	}

}
