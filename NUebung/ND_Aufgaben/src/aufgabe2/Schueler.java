/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe2;

/**
 *
 * @author jgruenauer17
 */
public class Schueler {
    private String vorname;
    private String nachname;
    private int gruppe;

    public Schueler(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
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

    public int getGruppe() {
        return gruppe;
    }

    public void setGruppe(int gruppe) {
        this.gruppe = gruppe;
    }

    @Override
    public String toString() {
        return gruppe + "," + vorname + "," + nachname;
    }
    
    
}
