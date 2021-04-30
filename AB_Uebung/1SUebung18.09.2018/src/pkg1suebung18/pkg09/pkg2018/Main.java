
package pkg1suebung18.pkg09.pkg2018;

import htl.In;
import htl.Out;
import javax.swing.JOptionPane;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aufgabe 1+2
        /*String zahl1 = JOptionPane.showInputDialog(null, "Bitte die erste Zahl eingeben:");
        String zahl2 = JOptionPane.showInputDialog(null, "Bitte die erste Zahl eingeben:");
        int x = Integer.parseInt(zahl1);
        int y = Integer.parseInt(zahl2);
        int add = add(x, y);
        int sub = sub(x, y);
        int mul = mul(x, y);
        double div = div(x, y);
        JOptionPane.showMessageDialog(null, "Das Ergebnis der Addition aus " + zahl1 + " und " + zahl2 + " = " + add);
        JOptionPane.showMessageDialog(null, "Das Ergebnis der Subtraktion aus " + zahl1 + " und " + zahl2 + " = " + sub);
        JOptionPane.showMessageDialog(null, "Das Ergebnis der Multiplikation aus " + zahl1 + " und " + zahl2 + " = " + mul);
        JOptionPane.showMessageDialog(null, "Das Ergebnis der Division aus " + zahl1 + " und " + zahl2 + " = " + div); */
        //Aufgabe 3
        /*Out.println("Die erste Zahl eingeben");
        int x = In.readInt();
        Out.println("Die zweite Zahl eingeben");
        int y = In.readInt();
        Out.println("Addition: " + add(x, y) + " Subtraktion: " + sub(x, y) + " Multiplikation: " + mul(x, y) + " Division: " + div(x, y));
        */
        //Aufgabe 4
        //Out.println("Die Durchschnittstemperatur beträgt " + durchschnittsTemperatur("Daten"));
        //Aufgabe 5
        String zahl = JOptionPane.showInputDialog(null, "Bitte geben sie die umzurechnenden Sekunden ein");
        umrechnen(Double.parseDouble(zahl));
    }

    public static int add(int x, int y){
        return x+y;
    }
    
    public static int sub(int x, int y){
        return x-y;
    }
    
    public static int mul(int x, int y){
        return x*y;
    }
    
    public static double div(double x, double y){
        return x/y;
    }
    
    public static double durchschnittsTemperatur(String datei){
        In.open(datei);
        double temp = In.readDouble();
        double anz = 0;
        while(In.done())
        {

            temp += In.readDouble();
            anz++;
        }
        return temp/anz;
    }
    
    public static void umrechnen(double zahl){
        int minuten = (int)(zahl/60); 
        int stunden = (int)(zahl/60/60);
        int sekunden = (int)(zahl/60/60-stunden)*3600;
        JOptionPane.showMessageDialog(null, "Sekunden = " + sekunden + " Minuten = " + minuten + " Stunden = " + stunden);
    }
    
    
    
}
