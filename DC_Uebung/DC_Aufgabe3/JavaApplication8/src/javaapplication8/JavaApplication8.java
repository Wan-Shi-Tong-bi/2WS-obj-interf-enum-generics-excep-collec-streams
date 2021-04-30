/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import htl.In;
import htl.Out;
/**
 *
 * @author Admin
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        einlesen();
        auslesen();
        
    }
    
    public static void einlesen(){
        Out.open("Datei.txt");
        Out.println("1");
        Out.println("2");
        Out.println("3");
        Out.close();
    }
    
    public static void auslesen(){
        In.open("Datei.txt");
        int zahlen = In.readInt();
        int anz = 0;
        while(In.done()){
            int zahl = In.readInt();
            if(zahl != 0){
            zahlen = zahl;
            }
            anz++;
        }
        In.close();
        Out.println("Anzahl: " + anz + " Zahl: " +zahlen);
    }
    
}
