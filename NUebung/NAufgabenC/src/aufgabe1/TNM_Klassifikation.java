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
public class TNM_Klassifikation {
    private String additiionalClassifications;
    private int c;
    private int t;
    private int n;
    private int m;

    public TNM_Klassifikation(String additiionalClassifications, int c, int t, int n, int m) {
        this.additiionalClassifications = additiionalClassifications;
        this.c = c;
        this.t = t;
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return "TNM: " + additiionalClassifications + "C" + c + "T" + t + "N" + n + "M" + m;
    }

    public String getAdditiionalClassifications() {
        return additiionalClassifications;
    }

    public void setAdditiionalClassifications(String additiionalClassifications) {
        this.additiionalClassifications = additiionalClassifications;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    
    
    
}
