public class LengthConverter {
    
    public Length getLength(int mm){
        int m = (int)mm / 1000;
        int dm = ((int)mm/100)%10;
        int cm = ((int)mm/10)%10;
        int mim = (int)mm%10;
        return new Length(m,dm,cm,mim);
    }
    
    public String legth2String(Length o){
        return o.getM() + "m, " + o.getDm() + "dm, "+o.getCm()+"cm, "+o.getMm()+"mm";     
    }
    
}
