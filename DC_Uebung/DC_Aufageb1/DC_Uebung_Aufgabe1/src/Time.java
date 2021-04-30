public class Time {

    private int min;
    private int sek;

    public Time(int min, int sek) {
        this.min = min;
        this.sek = sek;
    }

    public int getSeconds(){
        int s = this.sek + (this.min*60);
        return s;
    }
            
}
