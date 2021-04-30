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
public class NegativeNumberException extends Exception{
    String message;
    int zahl;

    public NegativeNumberException(String message, int zahl) {
        this.message = message;
        this.zahl = zahl;
    }
    
    public String getMessage(){
        return "Ganz blöder Fehler! " + message + " zahl: " + zahl;
    }
}
