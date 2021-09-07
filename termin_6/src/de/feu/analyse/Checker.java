package de.feu.analyse;

public class Checker {

	public static void main(String[] args) {
		System.out.println("STRING-CHECK");
		System.out.println(stringcheck(""));
		System.out.println(stringcheck("s"));
		System.out.println(stringcheck("ss"));
		// stringcheck(null);

		System.out.println("BOOL-CHECK");
		System.out.println(boolcheck(true, true, false));

		System.out.println("INT-CHECK");
		System.out.println(intcheck(192));
		System.out.println(intcheck(Integer.MAX_VALUE));

	}

	static boolean stringcheck(String x) {
		byte s = 0;
		for (int i = 0; i < x.length(); ++i) {
			switch (s) {
			case 0:
				s = 1;
				break;
			case 1:
				s = 0;
				break;
			}
		}

		return s == 0;
	}

	static boolean boolcheck(boolean x, boolean y, boolean z) {
		return x && y && !z || !x && y && z || x && !y && !z;
	}

	static boolean intcheck(int x) {
		if (x <= 1) {
			return false;
		}
		for (int i = 2; i < x / 2; ++i) {
			if (x / i * i == x) {
				return false;
			}
		}
		return true;
	}

}
