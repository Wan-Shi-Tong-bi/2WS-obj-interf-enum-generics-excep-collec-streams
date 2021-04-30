
import htl.In;
import htl.Out;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class JOption {
    public static void main(String[] args){
        /*int a = JOptionPane.showConfirmDialog(null, "Choose", "Options", JOptionPane.YES_NO_CANCEL_OPTION);
        if(a == JOptionPane.CANCEL_OPTION){
            System.out.println(""+a);
        }*/
        /*einlesen();
        auslesen();*/
        proieren();
    }
    
    public static void proieren(){
        String a = "Hund";
        boolean b = new Boolean(a.equals("Hund"));
        if(b){
            System.out.println("Ja");
        }
    }
}
