/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe9;

import htl.In;
import htl.Out;

/**
 *
 * @author Markus
 */
public class PositiveZahlen {


		public static void main(String[] args) {
			PositiveZahlen pz = new PositiveZahlen();
			Out.println("Geben sie eine Zahl ein");
			int zahl = In.readInt();
			
			pz.Rechner(zahl);

		}

		public void Rechner(int zahl) {
			Out.println(zahl);
			
			Out.println(zahl / 10);
			Out.println(zahl % 10);
			

		}
	}


