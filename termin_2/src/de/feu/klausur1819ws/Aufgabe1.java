package de.feu.klausur1819ws;

/*
 * 
 * (a) statischen und einen dynamischen Bindung (sp�ter)
 * (b) AVL (sp�ter)
 * (c) float x = 2.5 kompiliert nicht -wieso 
 * (d) 3 Kommentar-Arten (dies hier Blockkommentar)
 * (e) Unterschied x++ und ++x
 * sp�ter
 * (f) �berschreiben/Vererbung Code-Beispiel
*/

/**
 * d) JavaDoc
 * 
 * @author micha
 *
 */
public class Aufgabe1 {

	public static void main(String[] args) {
		// Aufgabe c) weil es double ist, f anf�gen oder float->double (zu d)
		// eine-Zeile-Kommentar
		float x = (float) 2.5;

		int y = 1;
		System.out.println("Preincrement: " + ++y);
		System.out.println("Postincrement: " + y++);
		System.out.println("Post Postincrement: " + y);

	}

}
