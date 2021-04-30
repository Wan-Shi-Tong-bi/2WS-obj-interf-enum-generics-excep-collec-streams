/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Patient {
    String vorname;
    String nachname;

    public Patient(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Patient{" + "vorname=" + vorname + ", nachname=" + nachname + '}';
    }
    
}
