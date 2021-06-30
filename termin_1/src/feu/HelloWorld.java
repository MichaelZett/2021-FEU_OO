package feu;

// full qualified class name: feu.HelloWorld
public class HelloWorld {

	public static void main(String[] args) {
		usingObjects();

		usingPrimitives();

		String text = "Hello, world!";

		boolean ergebnis = text.equals("Hello, world!");

	}

	private static void usingPrimitives() {
		int zahl = 4711; // Ganzzahl
		long grosseZahl = 4711L; // groﬂe Ganzzahl
		double fliesspunkt = 23.11; // Flieﬂpunkt
		char buchstabe = 'd'; // Buchstabe
		boolean logisch = false; // logischer Ausdruck

		// Wrapper Autoboxing/-unboxing
		Long grossLong = grosseZahl;
		Integer ganzzahlWrapper = zahl;
		Character char2 = buchstabe;

		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		boolean ergebnis = (27 == (52 / 2));
	}

	private static void usingObjects() {
		PackagePrivateClassOne eineKlasse = null;
		eineKlasse = new PackagePrivateClassOne(99);

		PackagePrivateClassOne zwei = new PackagePrivateClassOne(200);

		eineKlasse.normaleMethode();
		zwei.normaleMethode();

		PackagePrivateClassOne.staticMethode();

	}

}
