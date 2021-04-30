package Aufgabe3;

import htl.Out;
import htl.In;

public class Zeichenfolge {

	public static void main(String[] args) {
		Zeichenfolge zf = new Zeichenfolge();
		Out.println("Geben sie ein Wort ein");
		String wort = In.readWord();
		Out.println(zf.dreheWortUm(wort));

	}

	static String dreheWortUm(String s) {
		if (s.length() < 2) {
			return s;
		} else {
			return dreheWortUm(s.substring(1)) + s.charAt(0);
		}
	}
}
