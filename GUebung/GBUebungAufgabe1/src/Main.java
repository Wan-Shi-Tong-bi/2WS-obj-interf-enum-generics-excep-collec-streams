/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buch[] b = new Buch[100];
        b[1]= new Buch("VanGoch", "Der Terror des Menschen", "bild");
        b[0]= new Buch("Thomas Hinterberger", "Die Schwierigkeiten des täglichen Lebens", "GOETHE");
        b[2]= new Buch("Benedikt", "Wie groß sein andere Menschen kleiner macht", "bild");
        b[3]= new Buch("Janssen", "Sind Menschen blöd", "bild");
        b[4]= new Buch("Bruno Mars", "Mein erstes Buch", "StarMagazin");
        Library lb = new Library(b);
        
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
   
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.suchenISBN(2));
        System.out.println("zwei geloescht");
        lb.loeschenISBN(2);
        
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
        System.out.println(lb.next());
    }
    
}
