package de.feu.rechteck;

/*Ich poste mal kurz die Aufgabe von der Altklausur in Kurzform: 
//In 2D Videospielen ist es wichtig herauszufinden ob zwei Spiel-Elemente 
//sich berühren. Spielfigur und Spielwelt sind als achsenorientierte Rechtecke
 *  abstrahiert. Die Rechtecke sind nicht rotiert sondern verlaufen parallel 
 *  zur vertikalen und horizontalen Achse. Ein Attribut x das das als
 *   Fließkommazahl die x-Koordinate des Mittelpunktes des Rechtecks angibt. 
//Ein Attribut y das als Fließkommazahl die Mittelpunkt des rechteckes angibt.
//Ein Attribut y das als Fließkommazahl die Mittelpunkt des rechteckes angibt.
 *  W ist die breite des rechteckes und h die höhe. 
 */
public class Rechteck {
	private float x;
	private float y;
	private float w;
	private float h;

	public Rechteck(float x, float y, float w, float h) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/*
	 * Es gibt die methode collison, die ein anderes Reckteck übergeben bekommt und
	 * true zurückgibt, wenn die beiden Recktecke kollidieren und sonst false.
	 * Implementieren sie die methode collison. Zwei rechtecke kollidieren, wenn es
	 * einen gemeinsamen Punkt gibt, der in der Fläche beider rechtecke liegt. Es
	 * ist sinvoll die x und y achse separat zu betrachten. In der x-achse ist es
	 * beispielsweise sinvoll drei fälle zu unterscheiden: ist die linke kante des
	 * zweiten rechtecks im ersten enthalten, ist die rechte kante des zweiten
	 * rechtecks im ersten rechteck enthalten, ist das erste rechteck im zweiten
	 * enthalten.
	 */
	boolean collision(Rechteck anderes) {
		float linkeKanteAnderes = anderes.x - anderes.w / 2;
		float rechteKanteAnderes = anderes.x + anderes.w / 2;
		float linkeKante = x - w / 2;
		float rechteKante = x + w / 2;

		if (linkeKanteAnderes >= linkeKante && linkeKanteAnderes <= rechteKante
				|| rechteKanteAnderes >= linkeKante && rechteKanteAnderes <= rechteKante
				|| linkeKante >= linkeKanteAnderes && rechteKante <= rechteKanteAnderes) {
			return true;
		}
		return false;
	}
}
