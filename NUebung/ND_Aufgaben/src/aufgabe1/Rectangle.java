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
public class Rectangle extends Shape{
    private int laenge;
    private int breite;

    public Rectangle(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }
    
    
    @Override
    public int area() {
        return laenge*breite;
    }

    @Override
    public int perimeter() {
        return 2*(laenge+breite);
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        return "Rectangle;" + laenge + ";" + breite;
    }
    
    
}
