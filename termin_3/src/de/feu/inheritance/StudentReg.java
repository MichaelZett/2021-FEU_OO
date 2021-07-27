package de.feu.inheritance;

public class StudentReg {

	public static void main(String[] args) {
		// 19ss - (e) Worin unterscheidet sich eine abstrakte Klasse von einer nicht
		// abstrakten Klasse?
		// 19ss - (f) Variablen in Java k�nnen einen statischen und einen dynamischen
		// Typ haben, in welchem Zusammenhang m�ssen der dynamische und der statische
		// Typ stehen?
		// 1819ws- (f) �berschreiben/Vererbung Code-Beispiel
		AbstractPerson peter = new Student("Peter", "M�ller");
		FullnameCarrier silke = new Student("Silke", "Meyer");
		FullnameCarrier michael = new Referent("Michael", "Z�ller");

		Object harald = new Student("", "");

		printLastname(silke);
		printLastname(peter);
		printLastname(michael);

	}

	private static void printLastname(FullnameCarrier fullnameCarrier) {
		System.out.println(fullnameCarrier.getFullname());
	}

}
