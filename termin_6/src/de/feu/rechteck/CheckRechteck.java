package de.feu.rechteck;

public class CheckRechteck {

	public static void main(String[] args) {
		Rechteck eins = new Rechteck(5.0F, 5.0F, 2.0F, 2.0F);
		Rechteck zwei = new Rechteck(5.0F, 5.0F, 4.0F, 4.0F);
		System.out.println("Kollision: " + eins.collision(zwei));
	}

}
