
import java.util.Random;
import htl.In;
public class Tipps {
    private int[] tipps;
    
    public Tipps(){
        tipps = new int[6];
    }
    
    public int tipperzeugen()
    {
        Random r = new Random();
        int x = r.nextInt(56);
        return x;
    }
    
    public void tippsfuellen()
    {
        for(int i = 0; i < tipps.length; i++)
        {
            int r = tipperzeugen();
            int help = 0;
            for(int e = 0; e < tipps.length - (5-i); e++)
            {
                if(r != tipps[e])
                {
                   help++;
                   if(help == (tipps.length - (5-i)));
                   {
                        tipps[i] = r;
                        System.out.println(tipps[i]);
                        break;
                   }
                }
                else
                {
                    break;
                }
            }
        }
        
    
    }
    
    public void tippuebergeben(int[] arr){
        for(int i = 0; i < tipps.length; i++){
            tipps[i] = arr[i];
        }
    }
    
    public int ueberpruefen(int[] arr)
    {
        int help = 0;
        for(int i = 0; i < tipps.length; i++)
        {
            if(tipps[i] ==  arr[i]){
                help++;
            }
        }
        return help;
    }
    
    public void tippeingeben(){
        for(int i = 0; i < tipps.length; i++){
            System.out.println(i+1 + ". Zahl eingeben: (0-56)");
            int x = In.readInt();
            if(x >= 0 && x <= 56){
                tipps[i] = x;
            }
            else{
                i--;
            }
        }
        
    }

    public int[] getTipps() {
        return tipps;
    }
          
    
    
}
