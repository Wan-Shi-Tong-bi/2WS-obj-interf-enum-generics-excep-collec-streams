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
class Instandhalter extends Personal implements Bezahlung{
    final int preisprozeit = 10;
    public Instandhalter(String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
    }
    
    @Override
    public int berechnungEinkommen(int zeit) {
        einkommen = preisprozeit*zeit;
        return einkommen;
    }

    @Override
    public String sagJob(String job) {
        return "Ich habe einen Job als " + job;
    }
}
