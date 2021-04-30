
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Main{

 


    public static void main(String[] args) {
        TimeConverter tc = new TimeConverter();
        String x = JOptionPane.showInputDialog("Zahl eingeben:");
        tc.creatAndPrintTime(Integer.parseInt(x));
    }
    
}
