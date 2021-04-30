/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Staticueben {
    public static int x = 3;
    public int y;
    
    Staticueben(int y){
        y = y;
    }
    
    public static void setx(int x){
        Staticueben.x = x;
    }
    public static int getx(){
        return x;
    }
    
    public void thisverwenden(Staticueben s){
        if(y instanceof Integer){
        
        }
    }
    
    public void testtest(){
        thisverwenden(this);
    }
    
}
