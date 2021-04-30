/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1;
import htl.*;
/**
 *
 * @author jgruenauer17
 */
public class Main {
    public static void main(String args[]) throws NegativeNumberException{
        int temp = 1;
        do{
        try{
            temp = 0;
            Out.println("Worker eingeben:");
            Worker w = eingabe();
            
        } catch(NegativeNumberException e){
            Out.println(e.getMessage());
            temp = 1;
        }
        }while(temp != 0);
        //Lehrer Lösung
        /*String n = In.readWord();
        String v = In.readWord();
        do{
        try{
            int g = In.readInt();
            
            Worker w = eingabe();
            
        } catch(NegativeNumberException e){
            Out.println(e.getMessage());
            temp = 1;
        }
        }while(temp != 0);*/
    }
    
   static Worker eingabe() throws NegativeNumberException{
       String n = In.readWord();
       String v = In.readWord();
       int g = In.readInt();
       return new Worker(v, n, g);
       
   }
}
