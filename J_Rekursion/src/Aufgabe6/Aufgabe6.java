/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe6;

/**
 *
 * @author Markus
 */
import htl.Out;
public class Aufgabe6 {
	
	public static void main(String[] args)
	{
		Aufgabe6 a6 = new Aufgabe6();
		a6.p(5);
	}
	static int p(int x){
		if(x==0) 
			return 1;
		else {
			int y = p(x-1);
			Out.println(x+y);
			return y + 1;  //Die Zahl wird in 2er Schritten größer, Von 2-10
		}
	}
}
