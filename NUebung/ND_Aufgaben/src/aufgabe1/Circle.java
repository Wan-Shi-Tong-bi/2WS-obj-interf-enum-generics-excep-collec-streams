/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

/**
 *
 * @author jgruenauer17
 */
public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public int area() {
        return (int)(radius*radius*Math.PI);
    }

    @Override
    public int perimeter() {
        return (int)(2+radius*Math.PI);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle;" + radius;
    }
    
    
    
}
