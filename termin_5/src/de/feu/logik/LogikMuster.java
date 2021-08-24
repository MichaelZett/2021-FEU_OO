package de.feu.logik;

public class LogikMuster {

	public static void main(String[] args) {
		System.out.println("Anzahl wahr: " + trueCounter());
	}

	public static int trueCounter() {
		int counter = 0;
		for (int u = 0; u < 2; ++u) {
			for (int v = 0; v < 2; ++v) {
				for (int w = 0; w < 2; ++w) {
					for (int x = 0; x < 2; ++x) {
						for (int y = 0; y < 2; ++y) {
							for (int z = 0; z < 2; ++z) {
								// 6 int-Werte, z.B. 010101
								// u > 0 bedeutet Konvertierung von int zu boolean (0=false,1=true)
								if (booleanformula(u > 0, v > 0, w > 0, x > 0, y > 0, z > 0)) {
									++counter;
								}
							}
						}
					}
				}
			}
		}

		return counter;
	}

	public static boolean booleanformula(boolean u, boolean v, boolean w, boolean x, boolean y, boolean z) {
		return !(u && v || w && !x || y && z && !u || z && v && !y
				|| (x && (y || !(x && z && w) && !(y || z))) && !(!z && !y || y && x && !z));
	}

}
