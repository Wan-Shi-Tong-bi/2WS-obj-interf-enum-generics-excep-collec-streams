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
public class Brandmelder {
    private boolean feuer;

    public Brandmelder(boolean feuer) {
        this.feuer = feuer;
    }

    public boolean isFeuer() {
        return feuer;
    }

    public void setFeuer(boolean feuer) {
        this.feuer = feuer;
    }
    
}
