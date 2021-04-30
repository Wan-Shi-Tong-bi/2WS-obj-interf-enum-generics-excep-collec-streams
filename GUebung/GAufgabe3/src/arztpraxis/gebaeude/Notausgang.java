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
public class Notausgang extends Tuere {
    
    public String tueregeoeffnet(Brandmelder b) {
        
        if(b.isFeuer() == true){
            open = true;
            return "Tür ist geöffnet da es brennt";
        }
        return "Türe geschlossen";
    }

    
}
