/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author jgruenauer17
 */
public class MyList {
    LinkedList<Angestellte> l;

    public MyList() {
        l = new LinkedList<>();
    }
    
    public void add(Angestellte p){
        l.add(p);
        Collections.sort(l);
    }
    
    public Angestellte get(int i){
        return l.get(i);
    }
    
    public void ausgabe(){
        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }
        System.out.println("-");
    }
}
