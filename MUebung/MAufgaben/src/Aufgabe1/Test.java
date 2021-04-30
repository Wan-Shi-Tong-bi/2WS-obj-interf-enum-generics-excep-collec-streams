/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1;

import java.util.ArrayList;

/**
 *
 * @author jgruenauer17
 */
public class Test {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();
        al.add("Hund");
        al.add("Affe");
        al.add("Baumann");
        Programm p = new Programm();
        System.out.println(al.toString());
        p.mySort(al,new StringComparator());
        System.out.println(al.toString());
    }
}
