
import javax.swing.JOptionPane;

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
        Time t1 = eingeben();
        Time t2 = eingeben();
        Time add = t1.addierenzeit(t1, t2);
        Time t3 = eingeben();
        Time sub = t1.subtrahierenzeit(t1, t3);
        Out.println("t1:");
        Time.uhrzeitAusgeben(t1);
        Out.println("t2:");
        Time.uhrzeitAusgeben(t2);
        Out.println("t3:");
        Time.uhrzeitAusgeben(t3);
        Out.println("add:");
        Time.uhrzeitAusgeben(add);
        Out.println("sub:");
        Time.uhrzeitAusgeben(sub);
        Out.println("Minuten t1: " + t1.umrechneninMin(t1));
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
