/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Aufgabe6 {
    
    public static void main(String args[]){
        int i = p(5);
        System.out.println(i);
    }
    
    static int p(int x){
        if(x==0)return 1;
        else{
            int y = p(x-1);
            System.out.println(x+y);
            return y+1;
        }
    }
}
