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
public class Car extends Comparable{
    String brand;
    String type;
    int power;

    public Car(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    @Override
    public boolean isLess(Comparable c) {
        Car car = (Car) c;
        if(this.power < car.power){
            return true;
        }
        return false;
    }
    
    
}
