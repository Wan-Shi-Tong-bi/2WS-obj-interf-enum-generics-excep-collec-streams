/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htl_grieskirchen.jeremias.enterprise;

abstract public class Employee {
    protected String name;
    protected String vorname;
    protected Division division;

    public Employee(String name, String vorname, Division division) {
        this.name = name;
        this.vorname = vorname;
        this.division = division;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", vorname=" + vorname + ", division=" + division + '}';
    }
    
    
    abstract public int calcWages();
}
