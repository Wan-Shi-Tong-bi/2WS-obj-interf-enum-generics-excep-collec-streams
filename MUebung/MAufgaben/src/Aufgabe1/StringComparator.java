/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1;

import java.util.Comparator;

/**
 *
 * @author jgruenauer17
 */
class StringComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return -1*s1.compareTo(s2);
    }
}
