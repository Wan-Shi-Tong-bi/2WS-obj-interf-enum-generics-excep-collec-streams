/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Time {
    private int stunden;
    private int minuten;
    private int sekunden;
    
    public Time(int h, int m, int s){
        stunden = h;
        minuten = m;
        sekunden = s;
    }
    
    public Time(){
        
    }    
    public Time addierenzeit(Time zeit1, Time zeit2){
        int sek = zeit1.getSekunden() + zeit2.getSekunden();
        int min = zeit1.getMinuten() + zeit2.getMinuten();
        int stu = zeit1.getStunden() + zeit2.getStunden();
        while(sek >= 60){
            sek = sek - 60;
            min++;
        }  
        while(min >= 60){
            min = min - 60;
            stu++;
        }  
        return new Time(stu, min, sek);
    }
    
    public Time subtrahierenzeit(Time zeit1, Time zeit2){
        int sub = zeit1.umrechneninSek(zeit1) - zeit2.umrechneninSek(zeit2);
        int stu = (int)(sub/3600);
        int min = (int) (sub - (stu*3600))/60;
        int sek = (int) (sub - (stu*3600) - (min * 60));
        return new Time(stu, min, sek);
    }
    
    public double umrechneninMin(Time zeit1){
        double min = (double)getMinuten() + (((double)getSekunden())/60) + ((double)getStunden()*60);
        return min;
    }
    
    public int umrechneninSek(Time zeit1){
        int sek = getSekunden() + (getMinuten()*60) + (getStunden()*3600);
        return sek;
    }
    
    public static void uhrzeitAusgeben(Time o){
        while(o.getSekunden() >= 60){
            o.setSekunden(o.getSekunden()-60);
            o.setMinuten(o.getMinuten() +1);
        }  
        while(o.getMinuten() >= 60){
            o.setMinuten(o.getMinuten() - 60);
            o.setStunden(o.getStunden()+1);
        }  
        System.out.println(o.getStunden() + "h " + o.getMinuten() + "min " + o.getSekunden() + "s");
    }
    
    public int getStunden() {
        return stunden;
    }

    public int getMinuten() {
        return minuten;
    }

    public int getSekunden() {
        return sekunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }

    public void setMinuten(int minuten) {
        this.minuten = minuten;
    }

    public void setSekunden(int sekunden) {
        this.sekunden = sekunden;
    }
    
    
}
