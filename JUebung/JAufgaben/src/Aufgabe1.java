/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Aufgabe1 {
    
    public static void main(String[] args){
        Aufgabe1 a = new Aufgabe1();
        System.out.println(a.rekfib(5));
        System.out.println(a.irekfib(5));
    }
    public int rekfib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return rekfib(n-1) + rekfib(n-2);
    }
    
    public int irekfib(int n){
        if( n == 0 || n == 1){
            return 1;
        } else{
            int x = 1;
            int y = 1;
            int z = 0; 
            for(int i = 2; i <= n; i++){
                z =x+y;
                x =y;
                y = z;
            }
            return z;
            }
    }
}
