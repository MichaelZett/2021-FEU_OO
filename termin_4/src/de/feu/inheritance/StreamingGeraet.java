package de.feu.inheritance;

public abstract class StreamingGeraet implements Geraet {
	protected boolean an = false;

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

	public abstract void verbindeMitInternet();

}
