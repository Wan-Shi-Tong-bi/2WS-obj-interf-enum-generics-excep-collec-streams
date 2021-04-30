/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Matthäus
 */
public class Programm {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("DVD-Daten"));
        LinkedList<DVD> dvds = new LinkedList<>();
        String line = br.readLine();
        do{
            String[] arr = line.split(";");
            if(arr != null){
                DVD d = new DVD(Genre.valueOf(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
                dvds.add(d);
            }
            line = br.readLine();
        }while(line != null);
        
        br = new BufferedReader(new InputStreamReader(System.in));
        boolean help = true;
        do{
            System.out.println("Einen Eintrag hinzufuegen? (j/n)");
            help = false;
            line = br.readLine();
            if(line.equals("j")){
                help = true;
                System.out.println("Genre?");
                Genre g = Genre.valueOf(br.readLine());
                System.out.println("Titel?");
                String t = br.readLine();
                System.out.println("Dauer?");
                int d = Integer.parseInt(br.readLine());
                System.out.println("Preis?");
                int p = Integer.parseInt(br.readLine());
                dvds.add(new DVD(g, t, d, p));
            }
        }while(help);
        br.close();
        Collections.sort(dvds);
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("DVD-Daten-Sort"));
        bw.write("Nach Titel sortierte Filmeliste:");
        for(DVD dvd1 : dvds){
            bw.write("\n" + dvd1.toString() );
        }
        bw.close();
    }
}
