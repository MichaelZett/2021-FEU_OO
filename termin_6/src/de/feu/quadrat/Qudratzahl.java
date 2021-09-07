package de.feu.quadrat;

public class Qudratzahl {
	public static void main(String[] args) {
		int firstCount = 0;
		int secondCount = 0;
		for (int i = 0; i < 100_000; i++) {
			if (isQuadratzahl(i)) {
				firstCount++;
			}

			if (isQuadratzahlMath(i)) {
				secondCount++;
			}
		}
		System.out.println("First: " + firstCount + " and second: " + secondCount);
	}

	// Ohne Math-Klasse (ineffizient)
	private static boolean isQuadratzahl(int i) {
		for (int j = 0; j <= i; j++) {
			if (j * j == i) {
				return true;
			}
		}
		return false;
	}

	private static boolean isQuadratzahlMath(int i) {
		double sqrt = Math.sqrt(i);
		return (sqrt == Math.rint(sqrt));
	}
}
