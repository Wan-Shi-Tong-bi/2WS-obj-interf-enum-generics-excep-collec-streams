/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.htl_grieskirchen.jeremias.enterprise;
/**
 *
 * @author Matthäus
 */
public class Worker extends Employee{
    private int stundenlohn;
    private int arbeitsstunden;

    public Worker(int stundenlohn, int arbeitsstunden, String name, String vorname, Division division) {
        super(name, vorname, division);
        this.stundenlohn = stundenlohn;
        this.arbeitsstunden = arbeitsstunden;
    }

    @Override
    public String toString() {
        return super.toString() + "Worker{" + "stundenlohn=" + stundenlohn + ", arbeitsstunden=" + arbeitsstunden + '}';
    }

    
    
    @Override
    public int calcWages() {
        return (stundenlohn*arbeitsstunden);
    }
    
    
    
    
}
