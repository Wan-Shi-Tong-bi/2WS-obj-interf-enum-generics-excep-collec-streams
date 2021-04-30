/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author pilge
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        TNMKlassifikation p1 = new TNMKlassifikation(0, "john", "doe");
//        p1.setA(true);
//        p1.setcForT(CEnum.C5);
//        p1.setT(TEnum.T2);
//        p1.setcForN(CEnum.C3);
//        p1.setN(NEnum.N0);
//        p1.setcForM(CEnum.C5);
//        p1.setM(MEnum.M0);
//        System.out.println("" + p1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wieviele Patienten: ");
        String temp = br.readLine();
        int anzahl = Integer.parseInt(temp);
        
        HashMap<Integer, TNMKlassifikation> map = new HashMap<>();
        
        for (int i = 1; i <= anzahl; i++) {
            System.out.println(i+". Person");
            try{
            System.out.print("Bitte id eingeben: ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Bitte Vorname eingeben: ");
            String vorname = br.readLine();
            System.out.print("Bitte Nachname eingeben: ");
            String nachname = br.readLine();

            TNMKlassifikation pC = new TNMKlassifikation(id, vorname, nachname);

            System.out.print("Wurde die Klassifikation bei einer Autopsie erstellt?(True/False) ");
            pC.setA(Boolean.parseBoolean(br.readLine()));
            System.out.print("Wurde die Klassifikation nach einer Therapie erstellt?(True/False) ");
            pC.setY(Boolean.parseBoolean(br.readLine()));
            System.out.print("Handelt es sich um ein Rezidiv?(True/False) ");
            pC.setR(Boolean.parseBoolean(br.readLine()));

            System.out.print("Bitte Sicherheit für T-Klassifikation angeben: ");
            pC.setcForT(CEnum.valueOf(br.readLine()));
            try{
            System.out.print("Bitte T-Klassifikation angeben: ");
            pC.setT(TEnum.valueOf(br.readLine()));
            }catch(IllegalArgumentException iaex){
                throw new TNMException("Triftiger Grund bei T-Klassifikation", 144);
            }
            
            System.out.print("Bitte Sicherheit für N-Klassifikation angeben: ");
            pC.setcForN(CEnum.valueOf(br.readLine()));
            try{
            System.out.print("Bitte N-Klassifikation angeben: ");
            pC.setN(NEnum.valueOf(br.readLine()));
            }catch(IllegalArgumentException iaex){
                throw new TNMException("Triftiger Grund bei N-Klassifikation", 144);
            }
            
             System.out.print("Bitte Sicherheit für M-Klassifikation angeben: ");
            pC.setcForM(CEnum.valueOf(br.readLine()));
            try{
            System.out.print("Bitte M-Klassifikation angeben: ");
            pC.setM(MEnum.valueOf(br.readLine()));
            }catch(IllegalArgumentException iaex){
                throw new TNMException("Triftiger Grund bei M-Klassifikation", 144);
            }

            map.put(id, pC);
            }catch(TNMException tnmex){
                System.out.println(tnmex.getErrorMessage());
                i--;
            }
        }
        
            BufferedWriter bw = new BufferedWriter(new FileWriter("Map.txt"));
            for(TNMKlassifikation tnmklas : map.values()){
                bw.write(tnmklas.toString());
            }
            
            bw.close();
        
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Map.txt"));
//        
//        oos.writeObject(map);
//        oos.close();

    }

}
