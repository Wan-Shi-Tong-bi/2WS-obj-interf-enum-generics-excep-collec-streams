/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Comparator;

/**
 *
 * @author Matthäus
 */
public class EnumComparator implements Comparator<Enum>{

    @Override
    public int compare(Enum o1, Enum o2) {
        if(o1.ordinal()>o2.ordinal()){
            return 1;
        }
        else if(o1.ordinal()<o2.ordinal()){
            return -1;
        }
        else{
            return 0;
        }    
        }
    
}
