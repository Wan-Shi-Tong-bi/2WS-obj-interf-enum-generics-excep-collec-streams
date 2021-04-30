public class Rennen {

    private Person[] per;

    public Rennen(Person[] per) {
        this.per = per;
    }
    public void print() {
        System.out.println("\n");
        for(int i = 0; i < per.length; i++){
            System.out.print("Person "+(i+1)+": ");
            per[i].print();
        }
    }
}
