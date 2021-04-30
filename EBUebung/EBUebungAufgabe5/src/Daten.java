/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthäus
 */
public class Daten {
    private int jahr;
    private double einkommen;
    
    Daten(int jahr, double einkommen){
        this.jahr = jahr;
        this.einkommen = einkommen;
    }

    @Override
    public String toString() {
        return "Daten{" + "jahr=" + jahr + ", einkommen=" + einkommen + '}';
    }

    public int getJahr() {
        return jahr;
    }

    public double getEinkommen() {
        return einkommen;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public void setEinkommen(double einkommen) {
        this.einkommen = einkommen;
    }
    
    
}
