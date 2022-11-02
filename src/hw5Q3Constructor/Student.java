package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public boolean sex;
	public float grade;

	public Student() {

	}

	public Student(String stName, int stID, boolean sex, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade;

		System.out.println("This is from default Constructor of Student class" + "\nStudent Name:" + stName + "\nID:"
				+ stID + "\nM:" + sex + "\nGrade:" + grade);
	}
}
