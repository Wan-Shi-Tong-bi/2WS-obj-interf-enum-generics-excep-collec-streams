/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Person {
    private String vorname;
    private String nachname;
    private int groesse;
    
    public Person(String v){
        vorname = v;

    }
    
    public Person(String v, String n){
        this(v);
        nachname = n;
    }
    
    public Person(String v, String n, int gr){
        this(v, n);
        groesse = gr;
    }

    @Override
    public String toString() {
        return "Vorname: " + getVorname() + " Nachname: " + getNachname() + " Groesse: " + getGroesse(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGroesse() {
        return groesse;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
    
    
    
    
}
