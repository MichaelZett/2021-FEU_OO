package de.feu.klausuren;

public class CaesarWithArray {

	private final static String INPUT = "olhehnxuvwhloqhkphughvnxuvhvhlqixhkuxqjlqglhremhnwrulhqwlhuwhsurjudpplhuxqjixhuzluwvfkdi"
			+ "wvlqirupvdwlnhuuhfkwkhucolfkhqjoxhfnzxqvfkcxuhuirojuhlfkhqhqwvfkoxhvvhoxqjghvfkliiuhvlfkkriih"
			+ "vlhkdwwhqnhlqhvfkzlhuljnhlwhqglhvhdxijdehcxehduehlwhqxqgzxhqvfkhlkqhqqrfkylhohuirojehlghuz"
			+ "hlwhuhqehduehlwxqjghudxijdehqglhvhunodxvxu";

	private final static char[] ALPHABET = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		String decoded = decode(INPUT, 3);
		System.out.println("Geheimtext: " + INPUT);
		System.out.println(" ---> " + decoded);
	}

	public static char shift(char letter, int shiftNumber) {
		// Finde den gegebenen Buchstaben im Alphabet
		for (int i = 0; i < ALPHABET.length; i++) {
			if (letter == ALPHABET[i]) {
				// wenn gefunden benutze als Zielindex, den index - shiftNumber
				int enschluesselterIndex = i - shiftNumber;
				// Wenn negativ, springe ans Ende
				if (enschluesselterIndex < 0) {
					enschluesselterIndex = enschluesselterIndex + ALPHABET.length;
				}
				return ALPHABET[enschluesselterIndex];
			}
		}
		return 'X';
	}

	public static String decode(String ciphertext, int key) {
		StringBuilder decoded = new StringBuilder(1000);
		// Jeden Buchstaben übersetzen und der Zielstruktur hinzufügen
		for (int i = 0; i < ciphertext.length(); i++) {
			char next = ciphertext.charAt(i);
			decoded.append(String.valueOf(shift(next, key)));
		}
		return decoded.toString();
	}

}
