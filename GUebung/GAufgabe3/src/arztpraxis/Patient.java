/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arztpraxis;

/**
 *
 * @author Matthäus
 */
class Patient extends Person{
    int ausgaben;
    private final int ausgabenprozeit = 20;
    public Patient(String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);

    }
    
    int berechnenAusgaben(int zeit){
        ausgaben = ausgabenprozeit*zeit;
        return ausgaben;
    }

    @Override
    public String toString() {
        return super.toString()+ "Patient{" + "ausgaben=" + ausgaben + ", ausgabenprozeit=" + ausgabenprozeit + '}';
    }
    
    
}
