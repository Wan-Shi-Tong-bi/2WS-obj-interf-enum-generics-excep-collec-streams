/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Child extends Parent {
    int hunger = 1;
    Child(int hunger){
        this.hunger = hunger;
        System.out.println(hunger);
    }
    
    public static void main(String args[]){
        Child b  = new Child(4);
    }
}
