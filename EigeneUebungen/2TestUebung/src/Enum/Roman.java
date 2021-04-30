/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Matthäus
 */
public enum Roman {
    I(1), V(5), X(10), L(500), C(100), D(500), M(1000);
    private int value;
    
    Roman(int v){
        this.value = v;
    }
    
    int getValue(){
        return value;
    }
}
