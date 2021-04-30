/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

/**
 *
 * @author Matthäus
 */
public class InvalidDateException extends Exception{
    private String message;
    private int zahl;

    public InvalidDateException(String message, int zahl) {
        this.message = message;
        this.zahl = zahl;
    }
    
    public String getMessage(){
        return "Fehlerhaftes Datum! " + message + " " + zahl;
    }
}
