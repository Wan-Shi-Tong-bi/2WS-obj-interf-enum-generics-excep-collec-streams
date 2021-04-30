



public class Main {


    public static void main(String[] args) {
        System.out.println("Geben Sie Ihren Tipp ein:");
        Tipps t1 = new Tipps();
        t1.tippeingeben();
        Tipps tzufall = new Tipps();
        System.out.println("Zufalls TIPP");
        tzufall.tippsfuellen();
        int x = t1.ueberpruefen(tzufall.getTipps());
        System.out.println("Sie haben " + x + " richtig!");
    }
    
}
