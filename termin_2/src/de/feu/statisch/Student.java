package de.feu.statisch;

public class Student extends Object {
	private static int count = 1;

	private String name;
	private String lastName;
	private final String studentId;

	public Student(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.studentId = String.format("%08d", count++);
	}

	public String getName() {
		return this.name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", studentId=" + studentId + "]";
	}

}
