package de.feu.klausuren;

public class Caesar {

	private final static String INPUT = "olhehnxuvwhloqhkphughvnxuvhvhlqixhkuxqjlqglhremhnwrulhqwlhuwhsurjudpplhuxqjixhuzluwvfkdi"
			+ "wvlqirupvdwlnhuuhfkwkhucolfkhqjoxhfnzxqvfkcxuhuirojuhlfkhqhqwvfkoxhvvhoxqjghvfkliiuhvlfkkriih"
			+ "vlhkdwwhqnhlqhvfkzlhuljnhlwhqglhvhdxijdehcxehduehlwhqxqgzxhqvfkhlkqhqqrfkylhohuirojehlghuz"
			+ "hlwhuhqehduehlwxqjghudxijdehqglhvhunodxvxu";

	public static void main(String[] args) {
		shortButUnreadable();
		System.out.println();
		readableButLonger();
	}

	private static void shortButUnreadable() {
		for (int i = 0; i < INPUT.length(); ++i) {
			char x = (char) (INPUT.charAt(i) - 3);
			if (x < 'a')
				x += 'z' - 'a' + 1;
			System.out.print(x);
		}
	}

	private static void readableButLonger() {
		// Nimm den character an Position i
		// Interpretiere char als dessen int-value und schiebe durch Substraktion 3 nach
		// links
		// Wenn wir aus unserem Alphabet raus gerutscht sind
		// springe um 26 (anzahl Buchstaben im Alphabet) nach rechts
		// caste den int-value wieder zu char

		for (int i = 0; i < INPUT.length(); ++i) {
			char encodedChar = INPUT.charAt(i);
			int decodedCharAsInt = encodedChar - 3;
			if (decodedCharAsInt < 'a') {
				decodedCharAsInt = decodedCharAsInt + 26;
			}
			char decodedChar = (char) decodedCharAsInt;

			System.out.print(decodedChar);
		}
	}
}
