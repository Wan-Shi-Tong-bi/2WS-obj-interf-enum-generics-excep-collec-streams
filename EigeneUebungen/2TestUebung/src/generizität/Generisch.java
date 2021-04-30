/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generizität;

/**
 *
 * @author Matthäus
 * @param <T>
 */
public class Generisch <T extends Integer> {
    T number;
    Generisch(T no){
        this.number = no;
    }
    
    void ausgebenNumber(){
        System.out.println(number);
    }
    
    /**
     *
     * @param <E>
     * @param hallo
     */
    public <E> void huhu(E hallo){
        
    }
}
