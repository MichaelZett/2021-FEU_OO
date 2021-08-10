package de.feu.klausuren;

public class Polynome {

	public static void main(String[] args) {
		long maxResult = Long.MIN_VALUE;
		int index = -1;
		for (int i = 0; i <= 100; i++) {
			long x3 = (long) Math.pow(i, 3.0);
			long x2 = (long) Math.pow(i, 2.0);
			long result = x3 - 150 * x2 + 4500 * i - 40_000L;

			if (result > maxResult) {
				maxResult = result;
				index = i;
			}
		}
		System.out.println("Index: " + index + " Result: " + maxResult);
	}

}
