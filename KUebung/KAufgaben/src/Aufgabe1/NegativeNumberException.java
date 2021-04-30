/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1;

/**
 *
 * @author jgruenauer17
 */
public class NegativeNumberException extends Exception{
    String message;
    int salary;

    public NegativeNumberException(String message, int salary) {
        this.message = message;
        this.salary = salary;
    }
    
    public String getMessage(){
        return "Fehler beim Erstellen! " + message + " ,Gehalt:" + salary;
    }

    @Override
    public String toString() {
        return "NegativeNumberException" + getMessage();
    }
    
    
}
