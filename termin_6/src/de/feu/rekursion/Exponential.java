package de.feu.rekursion;

public class Exponential {

	public static void main(String[] args) {
		double result = exp(7.0, 100);
		System.out.println("Ergebnis: " + result);
	}

	private static double exp(double x, int k) {
		double result = 0.0;
		for (int i = 0; i < k; i++) {
			result = result + Math.pow(x, i) / factorial(i);
		}
		return result;
	}

	private static double factorial(int number) {
		if (number <= 1) {
			return 1.0;
		}
		double result = 1.0;
		for (int i = 2; i < number; i++) {
			result = result * i;
		}
		return result;
	}

}
