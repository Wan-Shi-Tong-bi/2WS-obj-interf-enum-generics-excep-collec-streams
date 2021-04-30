package Aufgabe4;

import htl.In;
import htl.Out;

public class run {

	static Car[] Array = new Car[In.readInt()];
	Car car = new Car();

	public static void main(String[] args) {

		Out.println("Farbe: Typ: Jahr: Km:");

		for (int i = 0; i < Array.length; i++) {

			color c = color.valueOf(In.readString());
			Array[i] = new Car(c, In.readLine(), In.readInt(), In.readInt());
			Out.println(Array[i].toString());
		}

	}
}
