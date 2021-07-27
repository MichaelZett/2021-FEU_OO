package de.feu.inheritance;

public abstract class AbstractPerson implements FullnameCarrier {
	protected String name;
	protected String lastName;

	public AbstractPerson(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String getFullname() {
		return name + " " + lastName;
	}

	@Override
	public String toString() {
		return "AbstractPerson [name=" + name + ", lastName=" + lastName + "]";
	}

}
