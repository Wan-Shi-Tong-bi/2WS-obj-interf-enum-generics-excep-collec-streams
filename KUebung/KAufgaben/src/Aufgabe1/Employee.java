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
abstract public class Employee {
    String vorname;
    String nachname;
    int gehalt;

    public Employee(String vorname, String nachname, int gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Employee{" + "vorname=" + vorname + ", nachname=" + nachname + ", gehalt=" + gehalt + '}';
    }
}
