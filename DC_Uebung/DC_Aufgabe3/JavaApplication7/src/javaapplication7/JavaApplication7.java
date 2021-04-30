/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import htl.In;
import htl.Out;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication7 j = new JavaApplication7();
        int a = j.einlesen("newfile");
        System.out.println(a);
        JOptionPane.showMessageDialog(null, a);
    }
    
    public int einlesen(String datei)
    {
        In.open(datei);
        int i = In.readInt();
        int b = In.readInt();
        Out.close();
        System.out.println(b);
        return b;
    }
}
