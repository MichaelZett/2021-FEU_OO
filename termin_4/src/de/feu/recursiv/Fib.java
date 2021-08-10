package de.feu.recursiv;

import java.util.HashMap;
import java.util.Map;

public class Fib {
	private static int recursivCount = 0;
	private static Map<Integer, Integer> memory = new HashMap<>();

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "-te Zahl\t" + fibRekursiv(i) + "\t" + fibIterativ(i));
		}
		System.out.println("Rekursionshäufigkeit: " + recursivCount);
	}

	// rekursive Berechnung von Fibonacci-Zahlen
	static int fibRekursiv(int n) {
		recursivCount++;
		if (memory.get(n) != null) {
			return memory.get(n);
		} else {
			int result = 0;
			if (n <= 1) {
				result = n;
			} else {
				result = fibRekursiv(n - 1) + fibRekursiv(n - 2);
			}
			memory.put(n, result);
			return result;
		}
	}

	// iterative Berechnung von Fibonacci-Zahlen
	static int fibIterativ(int n) {
		if (n <= 1) {
			return n;
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