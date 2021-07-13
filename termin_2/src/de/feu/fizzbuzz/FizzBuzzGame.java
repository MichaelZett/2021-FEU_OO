package de.feu.fizzbuzz;

public class FizzBuzzGame {

	/**
	 * Die Spieler sitzen in der Regel im Kreis. Der als erste bestimmte Spieler
	 * sagt die Zahl „1“, und jeder Spieler zählt von da an reihum eine Zahl weiter.
	 * Jede durch drei teilbare Zahl wird jedoch durch das Wort „fizz“ und jede
	 * durch fünf teilbare Zahl durch das Wort „buzz“ ersetzt. Durch 15 teilbare
	 * Zahlen werden zu „fizz buzz“. Eine typische Runde Fizz Buzz würde
	 * beispielsweise wie folgt beginnen: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz,
	 * Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, ..., 97, 98, Fizz, Buzz
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.print("Fizz");
			} else if (i % 5 == 0) {
				System.out.print("Buzz");
			} else {
				System.out.print(i);
			}

			if (i < 100) {
				System.out.print(", ");
			}
		}
	}

}
