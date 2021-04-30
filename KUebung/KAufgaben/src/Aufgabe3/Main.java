/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;
import htl.*;
/**
 *
 * @author jgruenauer17
 */
public class Main {
   
    public static void main(String[] args){
        Out.println("Wie viele Fahrzeuge?");
        int anz = In.readInt();
        Vehicle[] v = new Vehicle[anz];
        do{
            Out.println("CAR oder BIKE?");
            String typ = In.readWord();
            switch(typ){
                case "CAR":
                    boolean b;
                    do{
                    b = false;
                    try{
                    Out.println("Power?");
                    int p = In.readInt();
                    Out.println("Capacity?");
                    int c = In.readInt();
                    v[anz-1] = new Car("Audi",2000, p, c);
                    }catch(NegativeNumberException nex){
                        Out.println(nex.getMessage());
                        b=true;
                    }
                    }while(b);
                    anz--;
                    break;
                case "BIKE":
                    v[anz-1]= new Bike(KindOfBike.BMX, "Karl", 2001);
                    anz--;
                    break;
                    
            }
            
        }while(anz>0);
        
        for(int i= 0; i < v.length; i++){
            Out.println(v[i]);
        }
    }
}
