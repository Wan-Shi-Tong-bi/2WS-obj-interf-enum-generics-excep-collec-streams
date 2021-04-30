import htl.In;
import htl.Out;

public class Main {
    
    
    public static void main(String[] args) {
        System.out.println("Fuegen Sie Personen hinzu:");
        Person[] p = new Person[3];
        p[0] = personhinzufuegen();
        p[1] = personhinzufuegen();
        p[2] = personhinzufuegen();
        Rennen r = new Rennen(p);
        r.print();
                
    }
    
    public static Person personhinzufuegen(){
        Out.println("Vorname:");
        String vnam = In.readWord();
        Out.println("Nachname:");
        String nnam = In.readWord();
        Out.println("Herkunftsland:");
        String land = In.readWord();
        Out.println("Minuten:");
        int m = In.readInt();
        Out.println("Sekunden:");
        int s = In.readInt();
        Time ti = new Time(m,s);
        return new Person(vnam, nnam, land, ti);
    }
    
}
