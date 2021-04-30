/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Rectangle {
    Point linkeobereEcke;
    Point rechteuntereEcke;
    public static int anz=0;
    public Rectangle(Point p1, Point p2){
        linkeobereEcke = p1;
        rechteuntereEcke = p2;
        anz++;
    }
    
    public Rectangle(int x1, int y1, int x2, int y2){
        linkeobereEcke = new Point(x1, y1);
        rechteuntereEcke = new Point(x2, y2);
    }
    
    public void print(){
        System.out.print("Linke obere Ecke: ");
        linkeobereEcke.print();
        System.out.print(" Rechte untere Ecke: ");
        rechteuntereEcke.print();
    }
    
    public void area(){
        int laenge = Math.abs((linkeobereEcke.x -rechteuntereEcke.x))+1;
        int breite = Math.abs((linkeobereEcke.y -rechteuntereEcke.y))+1;
        System.out.print("\n");
        for(int i = 0; i < breite; i++){
            for(int e = 0; e < laenge; e++){
                if(i == 0 ||i == breite-1){
                    System.out.print("~~");
                }
                else if(e == 0){
                    System.out.print("| ");
                }
                else if(e == breite -1){
                    System.out.print(" |");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    
    public int flaecheberrechnen(){
        int laenge = Math.abs((linkeobereEcke.x -rechteuntereEcke.x))+1;
        int breite = Math.abs((linkeobereEcke.y -rechteuntereEcke.y))+1;
        int flaeche = laenge*breite;
        return flaeche;
    }
}
