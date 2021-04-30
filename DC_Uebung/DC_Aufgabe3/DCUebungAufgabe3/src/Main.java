import htl.In;
import htl.Out;
public class Main {

    public static void main(String[] args) {
        Out.println("Tag");
        int tag = In.readInt();
        Out.println("Monat");
        String monat = In.readWord();
        Out.println("Jahr");
        int jahr = In.readInt();
        MyDate md = new MyDate(tag, monat, jahr);
        Out.println(md.formatDate());
        Out.println("Tage hinzufuegen");
        tag = In.readInt();
        md.addDays(tag);
        Out.println(md.formatDate());
        Out.println("Monate hinzufuegen");
        tag = In.readInt();
        md.addMonths(tag);
        Out.println(md.formatDate());
        Out.println("Jahre hinzufuegen");
        jahr = In.readInt();
        md.addYear(jahr);
        Out.println(md.formatDate());
        Out.println("Tage des Jahre:" + md.getDaysInYear());
    }
    
}
