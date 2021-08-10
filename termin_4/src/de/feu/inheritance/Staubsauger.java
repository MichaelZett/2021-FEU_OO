package de.feu.inheritance;

public class Staubsauger implements Geraet {
	private boolean an = false;

	@Override
	public void einschalten() {
		this.an = true;
	}

	@Override
	public void ausschalten() {
		this.an = false;
	}

	@Override
	public boolean isAn() {
		return this.an;
	}

}
