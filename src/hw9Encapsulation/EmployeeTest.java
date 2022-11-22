package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setName("Tom peter");
		employee.setAge(50);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("My Name is ;" + employee.getName() + "\nI am " + employee.getAge() + "years old"
				+ "\nmy Gender is :" + employee.getSex() + "\nAnd I am a US citizen:" + employee.getUsCitizen());
	}

}
