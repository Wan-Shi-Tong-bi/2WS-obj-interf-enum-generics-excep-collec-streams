/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

/**
 *
 * @author jgruenauer17
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws InvalidDateException{
        this.day = day;
        this.month = month;
        this.year = year;
        if(day<1||day>31) throw new InvalidDateException("Kein möglicher Tag!", day);
        else if(month<1||month>12) throw new InvalidDateException("Kein mögliher Monat", month);
        else if(year<0)throw new InvalidDateException("Kein mögliches Jahr!", year);
    }
    
    public Date(){
        
    }

    @Override
    public String toString() {
        return day+"."+month+"."+year;
    }
    

    
    
}
