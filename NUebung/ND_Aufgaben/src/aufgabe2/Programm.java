/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author jgruenauer17
 */
public class Programm {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("2mListe"));
        BufferedReader bri = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        LinkedList<Schueler> schueler = new LinkedList<>();
        do{
            String[] arr = line.split(",");
            Schueler s = new Schueler(arr[0], arr[1]);
            System.out.println("Gruppe 1 oder Gruppe 2?");
            int gr = Integer.parseInt(bri.readLine());
            s.setGruppe(gr);
            schueler.add(s);
            line = br.readLine();
        }while(line != null);
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("2MGruppenListe"));
        for (Schueler schueler1 : schueler) {
            bw.write(schueler1.toString() + "\n");
        }
        bw.close();
        bri.close();
    }
}
