
package arztpraxis;
import arztpraxis.gebaeude.*;

public class Arztpraxis {
    public Arzt arzt;
    public Instandhalter i;
    public Patient p;
    public Brandmelder br;
    public Eingangstuer ein;
    public Notausgang not;

    public Arztpraxis() {
        arzt = new Arzt("Franz", "Gunther", 23);
        i = new Instandhalter("Hans", "Mayr", 81);
        p = new Patient("Sophie", "Kalt", 12);
        br = new Brandmelder(false);
        ein = new Eingangstuer();
        not = new Notausgang();
    }

    @Override
    public String toString() {
        return "Arztpraxis-Personal{" + arzt.toString() + i.toString() + p.toString()+'}';
    }
    
    
}
