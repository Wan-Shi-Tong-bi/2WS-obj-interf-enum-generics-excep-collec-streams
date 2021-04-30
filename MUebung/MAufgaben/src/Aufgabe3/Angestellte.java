/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author jgruenauer17
 */
public class Angestellte implements Comparable<Angestellte> {
    private int id;
    private String name;
    private String vorname;
    private String strasse;

    public Angestellte(int id, String name, String vorname, String strasse) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.strasse = strasse;
    }
    
    @Override
    public int compareTo(Angestellte a){
        if(id > a.id){
            return 1;
        }else if(id < a.id){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "{" + "" + id + ", " + name + ", " + vorname + ", " + strasse + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    
    
    
    
    
}
