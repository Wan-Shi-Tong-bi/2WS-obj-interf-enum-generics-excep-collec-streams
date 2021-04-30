/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import htl.In;
import htl.Out;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class ArrayEinlesenAuslesen {
    ArrayList<String>worte1;
    String[] worte2;

    public ArrayEinlesenAuslesen(int i) {
        worte1 = new ArrayList<>();
        worte2 = new String[i];
    }
    
    public ArrayEinlesenAuslesen(int i, double z) {
        //Konstruktor Overloading
    }
    public ArrayEinlesenAuslesen(double i, int z) {
        
    }
    
    public static void main(String[] args){
        ArrayEinlesenAuslesen test = new ArrayEinlesenAuslesen(5);
        Out.println("Eingeben 1:");
        test.arraybefuellen();
        Out.println("Ausgabe 1:");
        test.arrayausgeben();
        int a = test.einlesen("Worte.txt");
        Out.println("Eingeben 2:");
        test.arraybefuellen();
        Out.println("Ausgeben:");
        test.arrayausgeben();
        int b = test.auslesen("Worte.txt");
        Out.println("Ausgabe 1:");
        test.arrayausgeben();
        if(test.equals(a, b)){
            JOptionPane.showMessageDialog(null, "Die Anzahl der beiden ist gleich", "Korrekt?", JOptionPane.INFORMATION_MESSAGE);
        }
        Out.println("Durchlauf beendet.");
    }
    
    public int einlesen(String datei){
        Out.open(datei);
        int anz = 0;
        for(int i = 0; i < worte2.length; i++){
            Out.println(worte2[i]);
            anz++;
        }
        Out.close();
        return anz;
    }
    
    public int auslesen(String datei){
        In.open(datei);
        int lauf = 0;
        while(In.done()){
                String temp = In.readWord();
                if(!temp.equals("")){
                    worte2[lauf] = temp;
                    lauf++;
                }

        }
        In.close();
        return lauf;
    }
    
    public void arrayausgeben(){
        for(int i = 0; i < worte2.length; i++){
            Out.println(""+ worte2[i]);
        }
    }
    
    public void arraybefuellen(){
        for(int i = 0; i < worte2.length; i++){
            worte2[i]= In.readWord();         
        }
    }
    
    public boolean equals(int a, int b){
        if(a == b){
            return true;
        }
        return false;
    }
}
