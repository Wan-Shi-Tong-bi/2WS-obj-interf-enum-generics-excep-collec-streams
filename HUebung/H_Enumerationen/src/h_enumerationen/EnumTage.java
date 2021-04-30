/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h_enumerationen;

public enum EnumTage {
	Montag(1), Dienstag(2), Mittwoch(3), Donnerstag(4), Freitag(5), Samstag(6), Sontag(7);
	private int value;

	EnumTage(int val) {
		this.value = val;
	}

	int getValue() {
		return value;
	}
}
