/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arztpraxis;

/**
 *
 * @author Matthäus
 */
abstract class Personal extends Person{
    protected int einkommen;
    
    public Personal(String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
     
    }

    public int getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(int einkommen) {
        this.einkommen = einkommen;
    }

    abstract public String sagJob(String job);
    
    @Override
    public String toString() {
        return super.toString()+ "Personal{" + "einkommen=" + einkommen + '}';
    }

    
    
    
}
