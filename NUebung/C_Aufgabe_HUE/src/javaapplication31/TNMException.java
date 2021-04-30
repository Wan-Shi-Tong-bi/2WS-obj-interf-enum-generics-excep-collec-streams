/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author jgruenauer17
 */
public class TNMException extends Exception{
    private String triftigerGrund;
    private int nochtriftigereNummer;

    public TNMException(String triftigerGrund, int nochtriftigereNummer) {
        this.triftigerGrund = triftigerGrund;
        this.nochtriftigereNummer = nochtriftigereNummer;
    }
    
    public String getErrorMessage(){
        return "Fehler bei der TNM-Eingabe! Error: " + nochtriftigereNummer + " " + triftigerGrund;
    }
    
}
