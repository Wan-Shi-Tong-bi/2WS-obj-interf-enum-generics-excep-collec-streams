import htl.In;
import htl.Out;
public class Main {

    public static void main(String[] args) {
        Out.print("Millimeter eingeben: ");
        int mm = In.readInt();
        LengthConverter lc = new LengthConverter();
        Length l = lc.getLength(mm);
        Out.println(lc.legth2String(l));
    }
    
}
