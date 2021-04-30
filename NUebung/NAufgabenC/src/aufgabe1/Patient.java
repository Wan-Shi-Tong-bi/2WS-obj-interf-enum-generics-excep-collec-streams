/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

/**
 *
 * @author Matthäus
 */
public class Patient {
    private TNM_Klassifikation tnm;
    private String vorname;
    private String nachname;
    private int id;
    private static int lauf;

    public Patient(TNM_Klassifikation tnm, String vorname, String nachname) {
        this.tnm = tnm;
        this.vorname = vorname;
        this.nachname = nachname;
        lauf++;
        this.id = lauf;
    }

    public TNM_Klassifikation getTnm() {
        return tnm;
    }

    public void setTnm(TNM_Klassifikation tnm) {
        this.tnm = tnm;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient: " + vorname + " " + nachname + ", " + tnm + ", ID:" + id;
    }

    
    
}
