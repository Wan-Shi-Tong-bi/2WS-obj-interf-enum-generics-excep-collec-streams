
package javaapplication6;
import htl.In;
import htl.Out;
/**
 *
 * @author Admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        auslesen("Tuuk");
    }
    
    public static void einlesen(String datei){
        In.open(datei);
        
        Out.println("B");
        Out.println("C");
        Out.close();
    }
    
    public static void auslesen(String datei){
        String i = "";
        In.open(datei);
        
        i = In.readWord();
        
        Out.close();
        int e = Integer.parseInt(i);
        System.out.println(e);
      
        
    }
    
}
