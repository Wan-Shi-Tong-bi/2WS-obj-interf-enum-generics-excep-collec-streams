/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

import htl.Out;

/**
 *
 * @author Markus
 */
public class Run {

	public static void main(String[] args) {

		Track[] t = new Track[5];
		Track track1 = new Track(1, "Sinan", "Arztlack", 2.30);

		Track track2 = new Track(2, "Beni", "Atemlos", 4);

		Track track3 = new Track(3, "Lisa", "Morgens, Mittags, Abends, Saufen", 3.20);

		Track track4 = new Track(4, "Lele", "Standart", 2.55);

		t[0] = track1;
		t[1] = track2;
		t[2] = track3;
		t[4] = track4;

		CD cd = new CD("Ötzi", "Alle Sterne", t);
		cd.print(t);
		Out.println(cd.sumPlaytime(t, 0));

	}
}
