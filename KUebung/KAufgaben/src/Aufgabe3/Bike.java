/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author jgruenauer17
 */
public class Bike extends Vehicle {
    private KindOfBike kind;

    public Bike(KindOfBike kind, String brand, int yearOfConstruction) {
        super(brand, yearOfConstruction);
        this.kind = kind;
   
    }

    @Override
    public String toString() {
        return "Bike: " + "kind=" + kind + super.toString();
    }
    
    
    
}
