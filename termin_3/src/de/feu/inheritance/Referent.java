package de.feu.inheritance;

public class Referent extends AbstractPerson {

	public Referent(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public String getFullname() {
		return "Herr/Frau " + name + " " + lastName;
	}

}
