/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient p = new Patient("Franz", "Pauli");
        System.out.println(p.toString());
        Patient[] pa = new Patient[1];
        pa[0] = p;
        ArrayData ad = new ArrayData(pa);
        ad.hasNext();
        ad.next();
        Type t = new Type();
        FileData fd = new FileData();
        fd.hasNext();
        fd.next();
        
    }
    
}
