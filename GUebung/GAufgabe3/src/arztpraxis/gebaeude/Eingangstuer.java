/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arztpraxis.gebaeude;

/**
 *
 * @author Matthäus
 */
public class Eingangstuer extends Tuere {
    
    public String tueregeoeffnet(int zeit) {
        if(zeit <19 && zeit > 7){
            return "tuere geoeffnet";
        }
        
        return "Tür geschlossen";
    }
    
}
