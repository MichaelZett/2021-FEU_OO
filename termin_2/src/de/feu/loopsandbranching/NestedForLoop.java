package de.feu.loopsandbranching;

public class NestedForLoop {

	public static void main(String[] args) {

		String[][] bild = new String[10][10];

		System.out.println("Befülle das array...");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					bild[i][j] = String.valueOf(i);
				} else {
					bild[i][j] = "#";
				}
			}
		}
		System.out.println("...fertig. Gebe das array aus.");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(bild[i][j]);
			}
			System.out.println();
		}

	}

}
