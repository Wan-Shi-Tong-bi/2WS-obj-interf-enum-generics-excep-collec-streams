/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Statistik {
    Daten[] dat;

    public Statistik(int length) {
        dat = new Daten[length];
    }
    
    void setMatrix(Daten[] d){
        dat = d;
    }
    
    Daten calcAverage(){
        double gesEink = 0;
        int count =0;
        for(int i = 0; i<dat.length; i++){
            if(dat[i] != null){
                gesEink += dat[i].getEinkommen();
                count++;
            }
        }
        double avgEink = gesEink/count;
        return new Daten(2000, avgEink);
        
    }
    
}
