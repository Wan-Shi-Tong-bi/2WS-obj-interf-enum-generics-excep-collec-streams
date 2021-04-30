/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

import java.util.ArrayList;

/**
 *
 * @author Matthäus
 */
public class Test {
    public static void main(String[] args){
        Verwaltung v = new Verwaltung();
        ArrayList ar = new ArrayList();
        ar.add("Hallo");
        v.prozessHinzufuegen(new Prozess(2, "Coolster Prozess", ar));
        System.out.println("----------");
        Prozess p = new Prozess(100, "Schoenster Prozess", ar);
        v.prozessHinzufuegen(p);
        System.out.println("----------");
        v.prozessHinzufuegen(new Prozess(1, "Kleinster Prozess", ar));
        System.out.println("----------");
        v.prozessHinzufuegen(new Prozess(20, "Dickster Prozess", ar));
        System.out.println("----------");
        v.prozessEntfernen(p);
        System.out.println("----------");
        v.prozessEntfernen(new Prozess(20, "Dickster Prozess", ar));
    }
}
