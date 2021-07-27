package de.feu.inheritance;

import java.util.Objects;

public class Student extends AbstractPerson {
	private static int count = 1;

	private final String studentId;

	public Student(String name, String lastName) {
		super(name, lastName);
		this.studentId = String.format("%08d", count++);
	}

	public String getStudentId() {
		return this.studentId;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", lastName=" + getLastName() + ", studentId=" + studentId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentId, other.studentId);
	}

}
