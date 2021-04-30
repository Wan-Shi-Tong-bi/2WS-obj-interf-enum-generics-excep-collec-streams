/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

/**
 *
 * @author pilge
 */
public class Aufgabe2 {
    public static void main(String[] x ) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Map.txt"));
        HashMap<Integer, TNMKlassifikation> map = (HashMap<Integer, TNMKlassifikation>) ois.readObject();
        System.out.println("" + map);
    }
    
}
