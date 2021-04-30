/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jgruenauer17
 */
public class Test {
    public static void main(String[] args) throws IOException{
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 2));
        shapes.add(new Circle(3));
        shapes.add(new Circle(20));
        shapes.add(new Rectangle(9, 5));
        shapes.add(new Circle(11));
        Programme p = new Programme(shapes);
        p.auslesen("dateiEins");
        shapes.clear();
        shapes = p.einlesen("dateiEins");
        p = new Programme(shapes);
        p.auslesenPlus("dateiZwei");
    }
}
