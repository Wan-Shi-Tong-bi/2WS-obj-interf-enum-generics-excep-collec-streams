/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1;

import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author jgruenauer17
 */
public class Programm {
    
    public ArrayList mySort(ArrayList a, Comparator c){
        
        for(int i = 1; i < a.size(); i++){
            for(int j = 0; j<a.size(); j++ ){
                Object first = a.get(i);
                Object last = a.get(j);
                if(c.compare(first, last) > 0){
                    Object temp = last;
                    a.set(j, a.get(i));
                    a.set(i, temp);
                }
                
            }
                
        }
        return a;
    }
}
