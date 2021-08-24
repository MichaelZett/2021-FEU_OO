package de.feu.euler;

public class Euler10 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2_000_000; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
			if (i % 100_000 == 0) {
				System.out.println(i + " and calculating...");
			}
		}
		System.out.println("Summe: " + sum);
		// Summe: 142.913.828.923
	}

	private static boolean isPrime(int number) {
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		int maxTeiler = ((int) Math.sqrt(number)) + 1;
		for (int i = 3; i <= maxTeiler; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
