/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import htl.In;
import htl.Out;
import javax.swing.JOptionPane;
/**
 *
 * @author jgruenauer17
 */
public class TimeConverter {
    
    public TimeConverter(){
        
    }
    
    public Time getTime(int x){
        double hour = ((double)x/3600);
        double minute = (hour - (int) hour) * 60;
        double second = (minute - (int) minute) * 60;
        return new Time((int)hour, (int) minute, (int) second);
    }
    
    public void printTime(Time o){
        Out.println(o.getHour() +"h " + o.getMinute() +"' " + o.getSecond() + "''");
    }
    
    public void creatAndPrintTime(int x)
    {
        Time t = getTime(x);
        printTime(t);
    }
    
}
