/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import htl.Out;
/**
 *
 * @author jgruenauer17
 */
public class ClassList {
    
    public static Person[] getLehrlingeTGW(){
        Person[] p = new Person[5];
        p[0] = new Person("Jan");
        p[1] = new Person("Tobias", "W.");
        p[2] = new Person("Tobias", "S.");
        p[3] = new Person("Lukas");
        p[4] = new Person("Roland");
        return p;
    }
    
    
    
    public static void printClass(Person[] persons){
        for(int i = 0; i < persons.length; i++){
            Out.println(persons[i].toString());
        }     
    }
    
    public static void showClass(){
        Person[] p = getLehrlingeTGW();
        printClass(p);
    }
    
}
