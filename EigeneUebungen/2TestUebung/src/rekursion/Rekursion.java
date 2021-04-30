/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursion;

/**
 *
 * @author Matthäus
 */
public class Rekursion {
    public static void main(String[] args){
        Rekursion r = new Rekursion();
        System.out.println(r.fak(1));
        System.out.println(r.fakit(0));
    }
    
    int fak(int n){
        if(n == 1){return 1;}
        return n * fak(n-1);
    }
    
    int fakit(int n){
        int erg = 1;
        for(int i = 1; i <= n; i++){
            erg *= i;
        }
        return erg;
    }
}
