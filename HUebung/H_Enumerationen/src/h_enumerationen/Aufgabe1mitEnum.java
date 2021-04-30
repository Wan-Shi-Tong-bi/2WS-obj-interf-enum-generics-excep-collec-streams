package h_enumerationen;

import htl.In;

public class Aufgabe1mitEnum {

	int[] Woche = new int[7];

	public void add(Enum a)
	{
		count(a.ordinal())++;
	}
}
