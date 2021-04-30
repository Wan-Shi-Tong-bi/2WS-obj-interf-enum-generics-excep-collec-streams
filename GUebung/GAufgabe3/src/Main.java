/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import arztpraxis.Arztpraxis;
/**
 *
 * @author Matthäus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arztpraxis a = new Arztpraxis();
        System.out.println(a.toString());
        System.out.println(a.ein.tueregeoeffnet(20));
        System.out.println(a.ein.tueregeoeffnet(12));
        System.out.println(a.not.tueregeoeffnet(a.br));
        a.br.setFeuer(true);
        System.out.println(a.not.tueregeoeffnet(a.br));
    }
    
}
