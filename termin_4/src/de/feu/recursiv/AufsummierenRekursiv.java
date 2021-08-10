package de.feu.recursiv;

public class AufsummierenRekursiv {
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println(sum(100));
		System.out.println(counter);

	}

	public static int sum(int n) {
		counter++;
		if (n >= 1) {
			return sum(n - 1) + n; // Methode ruft sich selber auf
		} else { // Abbruchbedingung ( n==0)
			return n;
		}
	}

}
