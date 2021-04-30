/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben;

/**
 *
 * @author jgruenauer17
 */
public class Patient {
    String vorname;
    String nachname;
    int id;
    TNMKlassifikation tnm;
    static int lauf = 0;

    public Patient(String vorname, String nachname, TNMKlassifikation tnm) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.tnm = tnm;
        lauf++;
        id = lauf;
    }

    @Override
    public String toString() {
        return "{ "+vorname + ", " + nachname + ", " + id + "," + tnm + '}';
    }
    
    
    
}
