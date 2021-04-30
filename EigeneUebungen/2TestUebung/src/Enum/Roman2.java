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
public class Roman2 {
    static final Roman2 I = new Roman2(1);
    static final Roman2 V = new Roman2(5);
    static final Roman2 X = new Roman2(10);
    private int value;
    Roman2(int v){
        this.value=v;}
    int getValue(){return value;}
}
