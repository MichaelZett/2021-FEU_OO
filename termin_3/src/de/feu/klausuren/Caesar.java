package de.feu.klausuren;

public class Caesar {

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

//		for(int i=0; i<input.length();++i) {
//            char x = (char)(input.charAt(i)-3);
//            if(x<'a')x+='z'-'a'+1;
//            System.out.print(x);
//        }
	}

	public static char shift(char letter, int shift) {
		// "Trick" : Buchstaben als Zahl behandeln
		// Wenn man ein char zu int castet sind z.B. die Kleinbuchstaben 97-122, folgen
		// also aufeinaner
//		if (letter >= 'a' && letter <= 'z') {
//			letter += shift;
//			while (letter > 'z') {
//				letter -= 26;
//			}
//		}
//		return letter;
		for (int i = 0; i < ALPHABET.length; i++) {
			if (letter == ALPHABET[i]) {
				int enschluesselterIndex = i - shift;
				if (enschluesselterIndex < 0) {
					enschluesselterIndex = enschluesselterIndex + ALPHABET.length;
				}
				return ALPHABET[enschluesselterIndex];
			}
		}
		return 'X';
	}

	public static String decode(String ciphertext, int key) {
		// StringBuilder
		String decoded = "";
		for (int i = 0; i < ciphertext.length(); i++) {
			char next = ciphertext.charAt(i);
			decoded = decoded + shift(next, 26 - key);
		}
		return decoded;
	}

}
