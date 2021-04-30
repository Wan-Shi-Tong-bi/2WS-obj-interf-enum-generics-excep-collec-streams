public class Buch {

    private String autor;

    private String titel;
    private static int anzahl;
    private int isbn;

    private String verlag;

    public Buch(String autor, String titel, String verlag) {
        
        this.autor = autor;
        this.titel = titel;
        this.isbn = anzahl;
        this.verlag = verlag;
        anzahl++;
    }

    

    @Override
    public String toString() {
        return "Buch{" + "autor=" + autor + ", titel=" + titel + ", isbn=" + isbn + ", verlag=" + verlag + '}';
    }

    public String getAutor() {
        return autor;
    }

    public String getTitel() {
        return titel;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    
}
