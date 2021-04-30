/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htl_grieskirchen.jeremias.compare;

/**
 *
 * @author Matthäus
 */
public class Computer extends Comparable {
    String cpu;
    int speed;

    public Computer(String cpu, int speed) {
        this.cpu = cpu;
        this.speed = speed;
    }

    @Override
    public boolean isLess(Comparable c) {
        Computer com = (Computer) c;
        if(this.speed< com.speed){
            return true;
        }
            return false;
    }
    
    
}
