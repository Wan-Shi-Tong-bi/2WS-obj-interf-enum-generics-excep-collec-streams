/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Aufgabe9 {
    
    public static void main(String args[]){
        
        System.out.println(print(122233));
    }
    static int print(int n){
        if(n < 10)return n;
        else{
            System.out.println(print((n-(n%10))/10));
            return n - (n-(n%10));
        }
    }
}
