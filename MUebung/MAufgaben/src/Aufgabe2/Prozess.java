/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

import java.util.ArrayList;

/**
 *
 * @author Matthäus
 */
public class Prozess implements Comparable<Prozess>{
    private static int laufzahl;
    private int iD;
    int prioritaet;
    String prozessname;
    ArrayList param;

    public Prozess(int prioritaet, String prozessname, ArrayList param) {
        if(prioritaet < 0)this.prioritaet = -prioritaet;
        else {this.prioritaet = prioritaet;}
        this.prozessname = prozessname;
        this.param = param;
        laufzahl++;
        iD = laufzahl;
    }

    public int getiD() {
        return iD;
    }

    public String getProzessname() {
        return prozessname;
    }

    public void setProzessname(String prozessname) {
        this.prozessname = prozessname;
    }

    public ArrayList getParam() {
        return param;
    }

    public void setParam(ArrayList param) {
        this.param = param;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public void setPrioritaet(int prioritaet) {
        if(prioritaet < 0)this.prioritaet = -prioritaet;
        else {this.prioritaet = prioritaet;}
    }

    @Override
    public int compareTo(Prozess o) {
        if(this.prioritaet > o.prioritaet){
            return 1;
        }
        else if(this.prioritaet < o.prioritaet){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "{" + prioritaet + ", " + prozessname + ", " + param + ", " + iD + '}';
    }
    
    
    
    
    
}
