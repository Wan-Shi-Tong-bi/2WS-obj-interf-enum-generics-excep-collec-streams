/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;

/**
 *
 * @author pilge
 */
public class TNMKlassifikation {

    public TNMKlassifikation() {
    }

    int id;
    String vorname;
    String nachname;
    boolean a;
    boolean y;
    boolean r;
    CEnum cForT;
    TEnum t;
    CEnum cForN;
    NEnum n;
    CEnum cForM;
    MEnum m;

    public TNMKlassifikation(int id, String vorname, String nachname) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean isY() {
        return y;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    public boolean isR() {
        return r;
    }

    public void setR(boolean r) {
        this.r = r;
    }

    public CEnum getcForT() {
        return cForT;
    }

    public void setcForT(CEnum cForT) {
        this.cForT = cForT;
    }

    public TEnum getT() {
        return t;
    }

    @Override
    public String toString() {
        String temp = "id = " + id
                + " Vorname = " + vorname + " Nachname = " + nachname + " TNM-Klassififikation = ";
        if (a) {
            temp += "a";
        }
        if (r) {
            temp += "r";
        }
        if (y) {
            temp += "y";
        }
        if (cForT != null) {
            temp += cForT;
        }
        if (t != null) {
            temp += t;
        }
        if (cForN != null) {
            temp += cForN;
        }
        if (n != null) {
            temp += n;
        }
        if (cForM != null) {
            temp += cForM;
        }
        if (m != null) {
            temp += m;
        }
        temp += "\n";
        return temp;
    }

    public void setT(TEnum t) {
        this.t = t;
    }

    public CEnum getcForN() {
        return cForN;
    }

    public void setcForN(CEnum cForN) {
        this.cForN = cForN;
    }

    public NEnum getN() {
        return n;
    }

    public void setN(NEnum n) {
        this.n = n;
    }

    public CEnum getcForM() {
        return cForM;
    }

    public void setcForM(CEnum cForM) {
        this.cForM = cForM;
    }

    public MEnum getM() {
        return m;
    }

    public void setM(MEnum m) {
        this.m = m;
    }

}
