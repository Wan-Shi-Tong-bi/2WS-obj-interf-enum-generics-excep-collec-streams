package sa;

import htl.In;
import htl.Out;

public class SA {

	public static void main(String[] args) {

		int[] Array2 = {1, 2, 3, 4, 5}; // Array mit Werten direkt

		SA sa = new SA(); // Objekt von der jetztigen Klasser

		//Datei
		sa.SchreibenInDatei(); //schreibt in die Datei
		sa.LeseAusDatei(); // Liest aus der Datei

		//Array
		sa.ArrayErstelle(); //erstellt ein Array
		sa.ArrayBefüllen(); //Befüllt das Array
		sa.ArrayAusgeben(); // Gibt das Array aus

		//Sortieren
		sa.BubbleSort(); //Soertiert ein Array

		//Rechnen
		sa.Minimum(Array2); //Sucht das Minimum im Array
		sa.Maximum(Array2); //Sucht das Maximum im Array
		sa.Durschnitt(Array2); //rechnet den Durschnitt im Array aus

	}

	// Datei
	public void SchreibenInDatei() { //Schreibt in die Datei
		Out.open("Text");
		Out.print("Test");
		Out.close();
	}

	public void LeseAusDatei() { //Lest aus der Datei aus

		In.open("Text");

		while (In.done()) {
			Out.print(In.readLine());
		}
		In.close();
	}

	//Array
	public void ArrayErstelle() {
		int[] Array = new int[5]; // erstellt ein int Array mit 5 Wertstellen

	}

	public void ArrayBefüllen() {
		int[] Array;
		Array = new int[5]; //erstellt ein int Array mit 5 Wertstellen

		for (int i = 0; i < Array.length; i++) // For-Schleife
		{
			Array[i] = i;	// Befüllt das Array mit Zahlen
		}
	}

	public void ArrayAusgeben() {
		int[] Array = new int[5]; // erstellt ein Array

		for (int i = 0; i < Array.length; i++) {
			Out.print(Array[i]); // Gibt das Array aus
		}
	}

	//Sortieren
	public void BubbleSort() {

		int[] Array = new int[5]; //Array
		int temp;

		for (int i = 1; i < Array.length; i++) {
			for (int j = 0; j < Array.length; j++) {

				if (Array[j] > Array[j + 1]) {

					temp = Array[j];
					Array[j] = Array[j + 1];
					Array[j + 1] = temp;

				}
			}
		}

	}

	//Rechnen
	public void Minimum(int[] Array) //Sucht das Minimum 
	{
		int min = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] < min) {
				min = Array[i];
			}
		}
	}

	public void Maximum(int[] Array) //Sucht das Maximum
	{
		int max = Array[0];
		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
		}
	}

	public void Durschnitt(int[] Array) {
		int dur = 0;
		for (int i = 0; i < Array.length; i++) {
			dur = dur + Array[i];
		}
		int durch = 0;
		durch = dur / Array.length;
	}

}
