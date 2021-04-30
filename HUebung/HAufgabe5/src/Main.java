/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import at.htl_grieskirchen.jeremias.enterprise.*;
import htl.*;
/**
 *
 * @author Matthäus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Out.println("Wie viele Mitarbeiter gibt es?");
        int anz = In.readInt();
        Employee[] e = new Employee[anz];
        String temp;
        for(int i = 0; i < e.length; i++){
            Out.println("Was wollen sie eingeben? (w/s)");
            temp = In.readWord();
            switch (temp) {
                case "w":
                    e[i]= new Worker(23, 100, "Franz", "Huber", Division.Produktion);
                    break;
                case "s":
                    e[i]= new Salesperson(200, 20, 100, "Gerhard", "Hausler", Division.Verkauf);
                    break;
                default:
                    i--;
                    break;
            }
        }
        for(int i = 0; i < e.length; i++){
            Out.println(e[i].toString());
            Out.println("Er verdient: " + e[i].calcWages());
        }
    }
    
}
