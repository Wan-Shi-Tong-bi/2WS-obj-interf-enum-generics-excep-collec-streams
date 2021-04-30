public class Person {
    private String vorname;
    private String nachname;
    private String land;
    private Time t;

    Person(String vorname, String nachname, String land, Time t) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.land = land;
        this.t = t;
    }

    public void print() {
        System.out.print("Vorname=" + vorname + ", Nachname=" + nachname + ", land=" + land + ", Zeitn in s=" + t.getSeconds() +"\n");
    }

   
}
