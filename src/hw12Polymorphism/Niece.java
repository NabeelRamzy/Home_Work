package hw12Polymorphism;

public class Niece extends Sister {

	/*
	 * ...............overloading...................... When different methods exist
	 * with the same method name with same parameters or signature but with
	 * different syntax or logic, it is called method overriding. Method Overriding
	 * occurs during run time
	 */

	@Override
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 * age2 * age3 + 78;
		System.out.println("Total " + total1);
		return total1;

	}

	@Override
	public int sister(int age5, int age6) {
		int total2 = age5 + age6 * 9;
		System.out.println("Total " + total2);
		return total2;

	}

	@Override
	public int sister(int age1, int age2, int age3, String agr4, int age5, int age6) {
		int total3 = age1 / age2 + age3 + Integer.parseInt(agr4) + age5 + age6 + 80;
		System.out.println("Total " + total3);
		return total3;
	}/*
		 * // final type Method
		 * 
		 * @Override public final int sister(int age1, int age2, int age3, int age5) {
		 * int total4 = age1 + age2 + age3; System.out.println("Total" + total4); return
		 * total4;
		 * 
		 * Final type method can't Override // Can't override the final method from
		 * Sister class
		 * 
		 * } // Static type Method implemented
		 * 
		 * @Override public static int sister(int age1, int age2, int age3, String age4,
		 * int age5) { int total5 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		 * System.out.println("Total " + total5); return total5;
		 * 
		 * }
		 */

	/*
	 * Static method can't override or implemented // because static is a local
	 * member method of a class) // So, static method can't be override, if we
	 * remove @override it will work as // static method of this Niece class
	 */
	// void type method is implemented
	@Override
	public void sister() {
		System.out.println("This is from void type method from Sister class");
	}

	// void type parameterized method is implemented
	@Override
	public void sister(int age1, int age2, String age4, int age5, int age6) {
		int total6 = age1 + age2 + Integer.parseInt(age4) + age5 + age6 - 45;
		System.out.println("Total " + total6);

		/*
		 * ....... Overloading .......... When different methods exist with the same
		 * method name but with different parameters or signature, it is called method
		 * overloading. Method Overloading occurs during compile time
		 */
	}
}
