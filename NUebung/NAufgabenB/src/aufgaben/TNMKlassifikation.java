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
public class TNMKlassifikation {
    private char firstclassification;
    private int c;
    private int t;
    private int n;
    private int m;

    public TNMKlassifikation(char firstclassification, int c, int t, int n, int m) {
        this.firstclassification = firstclassification;
        this.c = c;
        this.t = t;
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return " "+firstclassification+'C'+c+'T'+t+'N'+n+'M'+m+" ";
    }
    
    
    
    
}
