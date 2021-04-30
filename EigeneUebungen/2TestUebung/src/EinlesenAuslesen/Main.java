/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EinlesenAuslesen;
import htl.*;
/**
 *
 * @author Matthäus
 */
public class Main {
    
    public static void main(String[] args){
        /*Out.open("Test");
        Out.println("1");
        Out.println("2");
        Out.println("3");
        Out.close();*/
        
        int[] i = new int[3];
        In.open("Test");
        i[0] = In.readInt();
        i[1] = In.readInt();
        i[2] = In.readInt();
        In.close();
        for(int e =0; e<i.length;e++){
            Out.println(i[e]);
        }
    }
    

}
