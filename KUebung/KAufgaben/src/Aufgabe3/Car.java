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
public class Car extends Vehicle{
    private int power;
    private int capacity;
    public Car(String brand, int yearOfConstruction, int power, int capacity) throws NegativeNumberException {
        super(brand, yearOfConstruction);
        this.power = power;
        this. capacity = capacity;
        if(power <0 ) throw new NegativeNumberException("Zu wenig Power! ", power);
        else if(capacity < 0) throw new NegativeNumberException("Zu wenig Capacity! ", capacity);
       
    }

    @Override
    public String toString() {
        return "Car: " + "power=" + power + ", capacity=" + capacity + super.toString();
    }
    
    
}
