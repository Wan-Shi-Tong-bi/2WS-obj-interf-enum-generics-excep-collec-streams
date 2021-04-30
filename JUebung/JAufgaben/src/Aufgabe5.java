/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Aufgabe5 {
    
    public static void main(String args[]){
        p(4);
    }
    
    static void p (int x){
        if(x>0)p(x-1);
        System.out.println(x);
    }
    
}
