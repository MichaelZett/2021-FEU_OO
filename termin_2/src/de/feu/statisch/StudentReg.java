package de.feu.statisch;

public class StudentReg {

	public static void main(String[] args) {
		Student peter = new Student("Peter", "Müller");
		Student silke = new Student("Silke", "Meyer");

		System.out.println(peter.getLastName());
		System.out.println(silke);

		for (int i = 0; i < 10; i++) {
			System.out.println(new Student("Maxima", "Musterfrau"));
		}

		for (int i = 1995; i < 2101; i++) {
			System.out.println("Das Jahr " + i + " ist ein Schaltjahr: " + DateUtilities.isLeapYear(i));
		}

	}

}
