package de.feu.euler;

/**
 * The sum of the squares of the first ten natural numbers is, The square of the
 * sum of the first ten natural numbers is, Hence the difference between the sum
 * of the squares of the first ten natural numbers and the square of the sum is
 * . Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 */
public class EulerSechs {

	public static void main(String[] args) {
		int summeZahlen = 0;
		int summeQuadrate = 0;
		for (int i = 1; i <= 100; i++) {
			summeZahlen = summeZahlen + i;
			summeQuadrate = summeQuadrate + (int) Math.pow(i, 2.0);
		}
		int ergebnis = summeZahlen * summeZahlen - summeQuadrate;
		System.out.println("" + ergebnis);

	}
}
