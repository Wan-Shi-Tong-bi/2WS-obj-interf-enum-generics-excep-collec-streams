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
public class Vehicle {
    String brand;
    int yearOfConstruction;

    public Vehicle(String brand, int yearOfConstruction) {
        this.brand = brand;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", yearOfConstruction=" + yearOfConstruction;
    }
    
    
}
