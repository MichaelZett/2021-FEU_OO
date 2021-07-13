package de.feu.loopsandbranching;

public class Branching {

	public static void main(String[] args) {
		System.out.println(wasIstEs(700));
		System.out.println(wasIstEsSwitch(70));

	}

	private static String wasIstEsSwitch(int number) {
		switch (number) {
		case 7: 
			return "wenig";
		case 70: 
			return "mittel";	
		default:
			return "viel";
		}
	}

	private static String wasIstEs(int number) {
		if (number < 10) {
			return "wenig";
		} else if (number < 100) {
			return "mittel";
		} else {
			return "viel";
		}
	}

}
