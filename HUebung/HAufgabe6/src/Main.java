/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import at.htl_grieskirchen.jeremias.compare.*;
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
        Out.println("Computer oder Car? (com/car)");
        String temp = In.readWord();
        switch (temp) {
            case "com":
                {
                    Computer c1 = new Computer("Coole CPU", 100);
                    Computer c2 = new Computer("Bessere CPU", 9000);
                    if(c1.isLess(c2)){
                        Out.println("Richtig");
                    }       break;
                }
            case "car":
                {
                    Car c1 = new Car("Audi", "R8", 400);
                    Car c2 = new Car("VW", "Kaefer", 80);
                    if(c1.isLess(c2)){
                        Out.println("Richtig");
            }       break;
                }
        }
    }
    
}
