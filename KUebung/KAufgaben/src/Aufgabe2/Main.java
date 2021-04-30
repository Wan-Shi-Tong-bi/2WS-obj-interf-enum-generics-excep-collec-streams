/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

import htl.In;
import htl.Out;

/**
 *
 * @author Matthäus
 */
public class Main {
    public static void main(String[] args){
        Date date = new Date();
        boolean b;
        do{
            b = false;
        
        try{
        int d = In.readInt();
        int m = In.readInt();
        int y = In.readInt();
        date = new Date(d, m, y);
        }catch(InvalidDateException iex){
            Out.println(iex.getMessage());
            b = true;
        }
        }while(b);
        
        Out.println(date);
    }
            
}
