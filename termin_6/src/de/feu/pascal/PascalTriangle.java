package de.feu.pascal;

public class PascalTriangle {

	public static void main(String args[]) {
		int rows = 13;

		for (int i = 0; i < rows; i++) { // Anzahl Zeilen
			for (int j = 1; j < rows - i; j++) { // Leerzeichen am Anfang jeder Zeile
				System.out.print("  ");
			}

			int coef = 1;
			for (int k = 0; k <= i; k++) {
				if (k == 0) { // das erste Element jeder Zeile ist 1
					coef = 1;
				} else {
					coef = coef * (i - k + 1) / k; // Formel
//                    i = 3, j = 0 -> 1 (coef)
//                    i = 3, j = 1 -> 3 (1*(3-1+1)/1)
//                    i = 3, j = 2 -> 3 (3*(3-2+1)/2)
//                    i = 3, j = 3 -> 1 (3*(3-3+1)/3)
				}

				System.out.printf("%4d", coef); // Printf ermöglicht formatierte Ausgabe
			}

			System.out.println();
		}
	}

}
