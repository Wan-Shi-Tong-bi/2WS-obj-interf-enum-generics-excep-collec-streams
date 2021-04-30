
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgruenauer17
 */
public class Sortieren implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        Buch b1 = (Buch)t;
        Buch b2 = (Buch)t1;
        if(b1.getIsbn() == b2.getIsbn()){
            return 0;
        }
        else if(b1.getIsbn() < b2.getIsbn()){
            return 1;
        }
        else if(b1.getIsbn() > b2.getIsbn()){
            return -1;
        }
        else{
        return 0;
        }
    }


 
    
}
