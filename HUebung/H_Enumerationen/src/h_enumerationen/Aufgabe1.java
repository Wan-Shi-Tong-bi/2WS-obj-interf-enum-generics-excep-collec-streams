package h_enumerationen;

import htl.In;
import htl.Out;

public class Aufgabe1 {

	static int[] Woche = new int[7];
	static String[] Tage = new String[7];

	public static void main(String[] args) {

		Aufgabe1 h = new Aufgabe1();
		h.Add(Woche, In.readInt(), In.readInt());
	}

	public void Add(int[] Woche, int Tag, int Unfälle) {
		Woche[Tag-1] += Unfälle;
		for (int i = 0; i < Woche.length; i++) {
			Out.println("Die Woche " + Woche[i]);
		}
	}
	

	
	

}
