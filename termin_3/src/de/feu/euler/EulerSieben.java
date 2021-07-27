package de.feu.euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10 001st prime number?
 *
 */
public class EulerSieben {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; /* we will break */ ; i++) {
			if (isPrime(i)) {
				count++;
				if (count == 10001) {
					System.out.println("" + i);
					break;
				}
			}
		}
	}

	private static boolean isPrime(int number) {
		boolean prime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				prime = false;
				break;
				// return false;
			}
		}
		return prime;
		// return true;
	}

}
