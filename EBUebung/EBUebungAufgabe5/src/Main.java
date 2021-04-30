/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Daten[] d = new Daten[10];
        d[1]= new Daten(2100, 100);
        d[2] = new Daten(230, 130);
        d[3] = new Daten(2300, 122);
        Statistik s = new Statistik(2);
        s.setMatrix(d);
        System.out.println(s.calcAverage().toString());
    }
    
}
