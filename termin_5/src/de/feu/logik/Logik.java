package de.feu.logik;

import java.util.Arrays;

public class Logik {
	public static void main(String[] args) {
		int count = 0;
		// bit representation von 000000 zu 111111
		for (int i = 0; i < 64; i++) {
			boolean[] bool = createBool(i);
			if (check(bool[0], bool[1], bool[2], bool[3], bool[4], bool[5])) {
				count++;
			}
		}
		System.out.println("Anzahl wahr: " + count);
	}

	// For-Schleife generiert mir nur int (decimal-System)
	private static boolean[] createBool(int number) {
		// Ergebnis-Array ist immer 6 lang mit false vorinitialisiert
		boolean[] result = new boolean[6];
		// Int (dec) int binär-Darstellung leider String und auch noch String
		// unterschiedlicher Länge
		String bitRep = Integer.toBinaryString(number);

		// abhängig von der konkreten String-Länge, das Array befüllen
		for (int i = 0; i < bitRep.length(); i++) {
			// mit == '1' Konvertierung char to boolean
			result[i] = bitRep.charAt(bitRep.length() - 1 - i) == '1';
		}

		System.out.println(bitRep + " - " + Arrays.toString(result));
		return result;
	}

//	private static boolean checkReduced(boolean u, boolean v, boolean w, boolean x, boolean y, boolean z) {
//		return !(u && v || w && !x || y && z && !u || z && v && !y || (x && (y || !(z && w) && !z)) && !(!z && !y || !z));
//	}

	private static boolean check(boolean u, boolean v, boolean w, boolean x, boolean y, boolean z) {
		return !(u && v || w && !x || y && z && !u || z && v && !y
				|| (x && (y || !(x && z && w) && !(y || z))) && !(!z && !y || y && x && !z));
	}
}
