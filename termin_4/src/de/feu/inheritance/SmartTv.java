package de.feu.inheritance;

public class SmartTv extends StreamingGeraet {

	public void netflix() {
		if (an) {
			System.out.println("Es l�uft netflix.");
		}
	}

	@Override
	public void verbindeMitInternet() {
		System.out.println("Benutze Wlan.");
	}
}
