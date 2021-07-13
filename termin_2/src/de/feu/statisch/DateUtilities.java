package de.feu.statisch;

public class DateUtilities {

	private DateUtilities() {
		// not intended
	}

	public static boolean isLeapYear(int year) {
		return divisableByNumber(year, 4) && (!divisableByNumber(year, 100) || divisableByNumber(year, 400));
	}

	private static boolean divisableByNumber(int year, int number) {
		return year % number == 0;
	}

}
