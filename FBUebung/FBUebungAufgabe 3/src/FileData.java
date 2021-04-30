/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class FileData extends AbstractData{
    @Override
    Patient next(){
        return new Patient("Franz", "Mayr");
    }
    
    @Override
    boolean hasNext(){
        return true;
    }

    public FileData() {
    }
    
    
}
