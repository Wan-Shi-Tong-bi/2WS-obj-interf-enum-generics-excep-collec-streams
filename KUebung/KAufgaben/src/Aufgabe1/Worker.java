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
public class Worker extends Employee {
    
    public Worker(String vorname, String nachname, int gehalt) throws NegativeNumberException {
        super(vorname, nachname, gehalt);
        if(gehalt < 0)throw new NegativeNumberException("Ganz wenig Gehalt! ", gehalt);
    }
    
}

