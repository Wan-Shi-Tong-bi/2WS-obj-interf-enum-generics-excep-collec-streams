/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Aufgabe3 {
    
    public static void main(String[] args){
        Aufgabe3 af = new Aufgabe3();
        System.out.println(af.spiegeln("Apfel"));
        System.out.println(af.spiegeln2("Apfel"));
    }
    
    public String spiegeln(String text){
        if(text.length() <= 1){
            return text;
        }
        return spiegeln(text.substring(1)) + text.charAt(0);
    }
    
    public String spiegeln2(String text){
        if(text.length() <= 1){
            return text;
        }
        String a = "";
        for(int i = text.length()-1; i >= 0; i--){
            a += text.charAt(i);
        }
        return a;
    }
}
