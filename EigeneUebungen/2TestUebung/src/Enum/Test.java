/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Matthäus
 */
public class Test {

    public static void main(String[] args){
        /*Roman r = Roman.C;
        System.out.println(r.getValue());
        System.out.println(r.toString());
        System.out.println(r.ordinal());
        System.out.println(r.valueOf("L").getValue());
        System.out.println(r.getValues);*/
        
        Roman2 r = new Roman2(30);
        System.out.println(r.getValue());
        
        Roman2 r2 = Roman2.I;
       
        
        Color c = Color.BLUE;
        if(c.compareTo(Color.BLUE)>0){
            System.out.println("richtig");
        }
        
        for (Color d : Color.values()) {
            System.out.println(d.toString() + "=" + d.ordinal());
        }
    }
}
