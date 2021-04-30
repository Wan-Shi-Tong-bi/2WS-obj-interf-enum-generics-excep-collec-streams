/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htl_grieskirchen.jeremias.enterprise;

/**
 *
 * @author Matthäus
 */
public class Salesperson extends Employee{
    private int basisgehalt;
    private int prozentProvisionen;
    private int summeVerkauft;

    public Salesperson(int basisgehalt, int prozentProvisionen, int summeVerkauft, String name, String vorname, Division division) {
        super(name, vorname, division);
        this.basisgehalt = basisgehalt;
        this.prozentProvisionen = prozentProvisionen;
        this.summeVerkauft = summeVerkauft;
    }

    @Override
    public String toString() {
        return super.toString() + "Salesperson{" + "basisgehalt=" + basisgehalt + ", prozentProvisionen=" + prozentProvisionen + ", summeVerkauft=" + summeVerkauft + '}';
    }

    
    
    @Override
    public int calcWages() {
        int temp = (int)((double)summeVerkauft*((double)prozentProvisionen/100));
        return temp + basisgehalt;
    }
    
    
}
