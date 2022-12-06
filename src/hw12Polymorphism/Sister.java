package hw12Polymorphism;

public class Sister {

	// Return type parameterized method implemented
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("Total " + total1);
		return total1;

	}

	public int sister(int age5, int age6) {
		int total2 = age5 + age6;
		System.out.println("Total " + total2);
		return total2;

	}

	public int sister(int age1, int age2, int age3, String agr4, int age5, int age6) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(agr4) + age5 + age6;
		System.out.println("Total " + total3);
		return total3;
	}

	// final type Method
	public final int sister(int age1, int age2, int age3, int age5) {
		int total4 = age1 + age2 + age3;
		System.out.println("Total" + total4);
		return total4;

	}

	// Static type Method implemented
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total5 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Total " + total5);
		return total5;

	}

	// void type method is implemented
	public void sister() {
		System.out.println("This is from void type method from Sister class");
	}

	// void type parameterized method is implemented
	public void sister(int age1, int age2, String age4, int age5, int age6) {
		int total6 = age1 + age2 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total " + total6);
	}
}
