/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Matthäus
 */
public class Patienten {
    HashMap<Integer, TNMKlassifikation> patienten;

    public Patienten(HashMap<Integer, TNMKlassifikation> patienten) {
        this.patienten = patienten;
    }
    
    public HashMap<Integer, TNMKlassifikation> getPatient(EnumComparator ec, String tnmtype){
        if(tnmtype.equals("T")){
            for(int i = 1; i < patienten.size(); i++){
            for(int j = i+1; j<=patienten.size(); j++ ){
                TEnum first = patienten.get(i).getT();
                TEnum last = patienten.get(j).getT();
                if(ec.compare(first, last) > 0){
                    TNMKlassifikation temp = patienten.get(j);
                    patienten.put(j, patienten.get(i));
                    patienten.put(i, temp);                
            }      
            }
            }
            return patienten;
        }else if(tnmtype.equals("N")){
            for(int i = 1; i < patienten.size(); i++){
            for(int j = 0; j<patienten.size(); j++ ){
                NEnum first = patienten.get(i).getN();
                NEnum last = patienten.get(j).getN();
                if(ec.compare(first, last) > 0){
                    TNMKlassifikation temp = patienten.get(j);
                    patienten.put(j, patienten.get(i));
                    patienten.put(i, temp);                
            }    
            }
            }
                return patienten;
        }else if(tnmtype.equals("M")){
            for(int i = 1; i < patienten.size(); i++){
            for(int j = 0; j<patienten.size(); j++ ){
                MEnum first = patienten.get(i).getM();
                MEnum last = patienten.get(j).getM();
                if(ec.compare(first, last) > 0){
                    TNMKlassifikation temp = patienten.get(j);
                    patienten.put(j, patienten.get(i));
                    patienten.put(i, temp);                
            }    
                return patienten;
            }
            }
        }
            return null;
        
    }
}
