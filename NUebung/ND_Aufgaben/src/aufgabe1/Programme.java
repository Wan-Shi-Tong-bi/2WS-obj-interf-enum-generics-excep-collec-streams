/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jgruenauer17
 */
public class Programme {
    ArrayList<Shape> shapes;

    public Programme(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    public void auslesen(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i)instanceof Rectangle){
                bw.write(((Rectangle)shapes.get(i)).toString()+"\n");
            }else if(shapes.get(i)instanceof Circle){
                bw.write(((Circle)shapes.get(i)).toString()+"\n");
            }
        }
        bw.close();
    }
    
    public void auslesenPlus(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < shapes.size(); i++){
            if(shapes.get(i)instanceof Rectangle){
                int a = ((Rectangle)shapes.get(i)).area();
                int p = ((Rectangle)shapes.get(i)).perimeter();
                bw.write(((Rectangle)shapes.get(i)).toString()+";"+a+";"+p+"\n");
            }else if(shapes.get(i)instanceof Circle){
                int a = ((Circle)shapes.get(i)).area();
                int p = ((Circle)shapes.get(i)).perimeter();
                bw.write(((Circle)shapes.get(i)).toString()+";"+a+";"+p+"\n");
            }
        }
        bw.close();
    }
    
    public ArrayList<Shape> einlesen(String filename) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        shapes.clear();
        String line = br.readLine();
        do{
            String[] temp = line.split(",");
            if(temp != null){
                if(temp[0].equals("Rectangle")){
                shapes.add(new Rectangle(Integer.parseInt(temp[1]), Integer.parseInt(temp[2])));
                }else if(temp[0].equals("Circle")){
                    shapes.add(new Circle(Integer.parseInt(temp[1])));
                }
            }
            line = br.readLine();     
        }while(line != null);
        br.close();
        return shapes;
    }
    
}
