package de.feu.klausur18ss;

//(a) In welchem Zusammenhang stehen die Begriffe Klasse und Objekt? 
//(b) Das folgende Programmfragment: float x = 1/2; belegt die Variable x mit dem Wert 0.
//    Erläutern Sie, wieso die Variable x nicht den Wert 0.5 hat. 
//(c) Was bedeutet es, eine Methode zu überladen? 
//(d) Erläutern Sie den Unterschied zwischen den Operatoren = und ==.

//später
//(e) Worin unterscheidet sich eine abstrakte Klasse von einer nicht abstrakten Klasse? 
//(f) Variablen in Java können einen statischen und einen dynamischen Typ haben, in welchem Zusammenhang
//    müssen der dynamische und der statische Typ stehen? 

public class Aufgabe1 {

	public static void main(String[] args) {
		// Aufgabe b) weil es eine ganzzahl-division ist.
		int zaehler = 1;
		int nenner = 2;
		float x = zaehler / nenner;
		System.out.println(x);
	}

	// c) überladene Methode - gleicher Name/ unterschiedlich
	// Parameter-/Rückgabedatentypen
	public String eineMethode(String parameter) {
		return parameter;
	}

	public int eineMethode(int parameter) {
		return parameter;
	}

	// d)
	public boolean operatoren() {
		boolean x = true; // = Zuweisung
		return x == true; // Identitätsprüfung
	}
}
