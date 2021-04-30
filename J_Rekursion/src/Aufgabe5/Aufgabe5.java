/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5;

import htl.Out;

public class Aufgabe5 {

	public static void main(String[] args) {

		Aufgabe5 a5 = new Aufgabe5();

		a5.p(4);

	}

	static void p(int x) {
		if (x > 0) {
			p(x - 1);
		}
		Out.println(x); // Die Zahl wird immer um 1 größer, von 0 - 4
	}
}
