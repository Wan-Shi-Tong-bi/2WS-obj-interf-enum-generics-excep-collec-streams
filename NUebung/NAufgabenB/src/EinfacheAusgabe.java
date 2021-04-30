/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;

/**
 *
 * @author jgruenauer17
 */
public class EinfacheAusgabe {
        public static void main(String[] args)
    {

        /* lokale Variable, in der die 
            Eingabe gespeichert werden soll (256 Zeichen lang) */         
         byte eingabe[] = new byte[256];

        /* lokale Variable, anhand der überprüft werden soll, 
            wie viele bytes tatsächlich eingelesen wurden */         
        int anzahlBytesgelesen = -1;

        /* lokale Variable, die später den 
            eingegebenen Text enthalten soll */
         
        String eingelesenerText="";

        try
        {
            /* Einlesen von der Kommandozeile bis 
                die "Enter"-Taste gedrückt wurde */             
            anzahlBytesgelesen = System.in.read(eingabe);
        }
        // Auffangen einer potentiellen Exception
        catch (IOException ex)
        {
             // Ausgabe der Aufruferliste im Falle einer Exception
            ex.printStackTrace();
        }
        // Überprüfung, ob bytes eingelesen wurden
        if(anzahlBytesgelesen >0)
        {
             /* Umwandlung eines byte Arrays in einen 
                String mit Hilfe eines Konstruktors */             
             /* Konstruktor von String erwartet an erster Stelle das Array,
                an zweiter Stelle, an welcher Position der Text 
                innerhalb des Arrays beginnt, und an dritter Stelle 
                die Länge des eingegebenen Textes */
              eingelesenerText = new String(eingabe,0,anzahlBytesgelesen);
        }
        /* Hier geben wir die Anzahl der eingelesen Bytes 
            und den eingelesenen Text aus. */       
        System.out.println("Es wurden "+ anzahlBytesgelesen
            +" Bytes gelesen!");
        System.out.println("Folgender Text wurde eingegeben: "
            + eingelesenerText);
 
    }

}
