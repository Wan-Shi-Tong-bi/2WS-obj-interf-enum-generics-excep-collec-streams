/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Matthäus
 */
public class Verwaltung {
    private LinkedList<Prozess> prozesse;

    public Verwaltung() {
        prozesse = new LinkedList<Prozess>();
    }

    public Verwaltung(LinkedList<Prozess> a) {
        this.prozesse = a;
        sortieren();
    }

    public void prozessHinzufuegen(Prozess a){
        prozesse.add(a);
        sortieren();
    }
    
    public void prozessEntfernen(Prozess a){
        prozesse.remove(a);
        sortieren();
    }
    
    public void sortieren(){
        Collections.sort(prozesse);
        for (Prozess prozesse1 : prozesse) {
            System.out.println(prozesse1);
        }
    }
    
}
