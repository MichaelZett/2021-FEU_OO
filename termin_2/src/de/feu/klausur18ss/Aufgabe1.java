package de.feu.klausur18ss;

//(a) In welchem Zusammenhang stehen die Begriffe Klasse und Objekt? 
//(b) Das folgende Programmfragment: float x = 1/2; belegt die Variable x mit dem Wert 0.
//    Erl�utern Sie, wieso die Variable x nicht den Wert 0.5 hat. 
//(c) Was bedeutet es, eine Methode zu �berladen? 
//(d) Erl�utern Sie den Unterschied zwischen den Operatoren = und ==.

//sp�ter
//(e) Worin unterscheidet sich eine abstrakte Klasse von einer nicht abstrakten Klasse? 
//(f) Variablen in Java k�nnen einen statischen und einen dynamischen Typ haben, in welchem Zusammenhang
//    m�ssen der dynamische und der statische Typ stehen? 

public class Aufgabe1 {

	public static void main(String[] args) {
		// Aufgabe b) weil es eine ganzzahl-division ist.
		int zaehler = 1;
		int nenner = 2;
		float x = zaehler / nenner;
		System.out.println(x);
	}

	// c) �berladene Methode - gleicher Name/ unterschiedlich
	// Parameter-/R�ckgabedatentypen
	public String eineMethode(String parameter) {
		return parameter;
	}

	public int eineMethode(int parameter) {
		return parameter;
	}

	// d)
	public boolean operatoren() {
		boolean x = true; // = Zuweisung
		return x == true; // Identit�tspr�fung
	}
}
