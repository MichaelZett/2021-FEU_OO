package de.feu.recursiv;

public class PowerOfTen {

	public static void main(String[] args) {
		System.out.println(powerOf10(2));
	}

	public static int powerOf10(int n) {
		if (n == 0) {
			return 1;
		}
		return powerOf10(n - 1) * 10;
	}

}
