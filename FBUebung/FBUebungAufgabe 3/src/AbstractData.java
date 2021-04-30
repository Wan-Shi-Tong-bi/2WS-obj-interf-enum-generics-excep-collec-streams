/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public abstract class AbstractData {
    Patient[] listPatient;
    
    abstract Patient next();
    
    abstract boolean hasNext();
    
    
}
