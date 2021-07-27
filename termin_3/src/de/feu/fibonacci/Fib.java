package de.feu.fibonacci;

public class Fib {
	private static int recursivCount = 0;

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "-te Zahl\t" + fibRekursiv(i) + "\t" + fibIterativ(i));
		}
		System.out.println("Rekursionshäufigkeit: " + recursivCount);
	}

	// rekursive Berechnung von Fibonacci-Zahlen
	static int fibRekursiv(int n) {
		recursivCount++;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibRekursiv(n - 1) + fibRekursiv(n - 2);
		}
	}

	// iterative Berechnung von Fibonacci-Zahlen
	static int fibIterativ(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		// Fuer n >= 2:
		int vorletztesFib = 0; // Variable für vorletzten Wert fib(i-2)
								// Vorbelegung: fib(0)
		int letztesFib = 1; // Variable für letzten Wert fib(i-1)
							// Vorbelegung: fib(1)
		int fib = 0; // Variable für aktuellen Wert fib(i)
		int i = 1; // Zaehler
		while (i < n) {
			fib = letztesFib + vorletztesFib;
			vorletztesFib = letztesFib;
			letztesFib = fib;
			i++;
		}
		return fib;
	}
}