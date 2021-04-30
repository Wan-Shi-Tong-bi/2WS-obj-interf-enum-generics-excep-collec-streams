/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Matthäus
 */
public class Test {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Patient> patienten = new HashMap<>();
        System.out.println("Wie viele Patienten wollen Sie eingeben?");
        int n = Integer.parseInt(eingabe());
        int ges = n;
        do{
            System.out.println(ges-n+1+". Patient:");
            System.out.println("Vorname:");
            String vor = eingabe();
            System.out.println("Nachname:");
            String nach = eingabe();
            System.out.println("TNM");
            System.out.println("a,y oder r?");
            String add = eingabe();
            System.out.println("Zuverlaessigkeit? (1-5)");
            int c = Integer.parseInt(eingabe());
            System.out.println("Tumor? (0-4)");
            int t = Integer.parseInt(eingabe());
            System.out.println("Lymphknoten? (0-3)");
            int n2 = Integer.parseInt(eingabe());
            System.out.println("Metastasen? (0/1)");
            int m = Integer.parseInt(eingabe());
            Patient p = new Patient(new TNM_Klassifikation(add, c, t, n2, m), vor, nach);
            patienten.put(p.getId(), p);
            n--;
        }while(n!=0);
            System.out.println("Fertig");
            for(int i = 1; i <= patienten.size(); i++){
                System.out.println(patienten.get(i));
            }
        }
    

    public static String eingabe(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String eingabe = "";
        try{
        eingabe = br.readLine();
        }catch(IOException ex){
        }
        return eingabe;
    }
    
}
