/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import htl.In;
import htl.Out;
/**
 *
 * @author Matthäus
 */
public class RectangleProgram {
    
    public static void main(String[] args){
        RectangleProgram r = new RectangleProgram();
        Out.println("Punkt 1:");
        Point p1 = r.punkteinlesen();
        Out.println("Punkt 2:");
        Point p2 = r.punkteinlesen();
        
        Rectangle rect = new Rectangle(p1, p2);
        rect.print();
        rect.area();
        int fl = rect.flaecheberrechnen();
        Out.println("Die Flaeche betraegt: " +fl);
        Out.println(Point.anz);
        Out.println(Rectangle.anz);
    }
    
    public Point punkteinlesen(){
        Out.println("x:");
        int x = In.readInt();
        Out.println("y:");
        int y = In.readInt();
        Point p = new Point(x,y);
        return p;
    }
}
