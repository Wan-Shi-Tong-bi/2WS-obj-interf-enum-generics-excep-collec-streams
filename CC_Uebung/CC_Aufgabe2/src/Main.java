/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import htl.In;
import htl.Out;
/**
 *
 * @author jgruenauer17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zahl 1");
        Time t1 = eingeben();
        System.out.println("Zahl 2");
        Time t2 = eingeben();
        Time add = t1.addierenzeit(t2);
        Time sub = t1.subtrahierenzeit(t2);
        Out.println("Zeit 1 in Minuten");
        Out.println(t1.umrechneninMin(t1));
        Out.println("Zeiten addiert " );
        add.uhrzeitAusgeben(add);
        Out.println("Zeiten subtrahiert ");
        sub.uhrzeitAusgeben(sub);
    }
    
    
    public static Time eingeben(){
        Out.println("Stunden");
        int h1 = In.readInt();
        Out.println("Minuten");
        int m1 = In.readInt();
        Out.println("Sekunden");
        int s1 = In.readInt();
        Time t1 = new Time(h1, m1,s1);
        return t1;
    }
    
}
