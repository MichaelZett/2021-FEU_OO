package de.feu.loopsandbranching;

public class EulerOne {
	private static final int FIVE = 5;
	private static final int THREE = 3;

	public static void main(String[] args) {
		int sum = 0;

		int cap = 1000;

//		sum = useFor(sum, cap);

		sum = useWhile(sum, cap);

		System.out.println(sum);

	}

	private static int useWhile(int sum, int cap) {
		int localSum = sum;
		int count = 0;
		while (count <= cap) {
			if (divisableByNumber(count, THREE) || divisableByNumber(count, FIVE)) {
				localSum = localSum + count;
			}
			count++;
		}
		return localSum;
	}

	private static int useFor(int sum, int cap) {
		int localSum = sum;
		for (int i = 0; i <= cap; i++) {
			if (divisableByNumber(i, THREE) || divisableByNumber(i, FIVE)) {
				localSum = localSum + i;
			}
		}
		return localSum;
	}

	private static boolean divisableByNumber(int number, int otherNumber) {
		return number % otherNumber == 0;
	}
}
