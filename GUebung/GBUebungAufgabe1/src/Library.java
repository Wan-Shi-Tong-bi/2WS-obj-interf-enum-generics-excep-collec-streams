

import java.util.Arrays;

public class Library {

    private Buch[] buecher;
    int anz = 0;

    public Library(Buch[] buecher) {
        this.buecher = buecher;
    }
    

    public Buch suchenISBN(int isbn) {
       for(int i = 0; i < buecher.length; i++){
           if(buecher[i] != null && buecher[i].getIsbn()== isbn){
               return buecher[i];
           }
       }
       return null;
    }

    public void loeschenISBN(int isbn) {
        for(int i = 0; i < buecher.length; i++){
           if(buecher[i] != null && buecher[i].getIsbn()== isbn){
               buecher[i] = null;
           }
       }
       
    }

    public Buch next() {
        
        for(int i = anz; i < buecher.length; i++){
            
            if(buecher[i] != null){
               anz=i+1;
               return buecher[i];
           }
           if(i == buecher.length-1){
            i = -1;}
       }
       return null;
    }

    public void sort() {
       Sortieren s = new Sortieren();
       Arrays.sort(buecher, s);
    }
}
