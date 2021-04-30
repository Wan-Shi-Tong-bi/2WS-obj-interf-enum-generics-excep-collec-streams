/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author jgruenauer17
 */
public class Test {
    public static void main(String[] args){
        MyList ml = new MyList();
        ml.add(new Angestellte(12, "Jo", "sef", "Street"));
        ml.ausgabe();
        ml.add(new Angestellte(13, "Ho", "sef", "Street"));
        ml.ausgabe();
        ml.add(new Angestellte(10, "Bo", "sef", "Street"));
        ml.ausgabe();
    }
}
