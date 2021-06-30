package feu;

class PackagePrivateClassOne {
	private static final String KLASSENNAME = "PackagePrivateClassOne";
	private Integer eineZahl = 17;

	public PackagePrivateClassOne(Integer eineZahl) {
		super();
		this.eineZahl = eineZahl;
	}

	public void normaleMethode() {
		System.out.println(eineZahl);
	}

	public static void staticMethode() {
		System.out.println(KLASSENNAME);
	}

}
