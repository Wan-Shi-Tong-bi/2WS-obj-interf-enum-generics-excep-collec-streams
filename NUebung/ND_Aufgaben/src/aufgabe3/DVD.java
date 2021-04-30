/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe3;

/**
 *
 * @author Matthäus
 */
public class DVD implements Comparable<DVD>{
    private Genre genre;
    private String titel;
    private int spielzeit;
    private int preis;

    public DVD(Genre genre, String titel, int spielzeit, int preis) {
        this.genre = genre;
        this.titel = titel;
        this.spielzeit = spielzeit;
        this.preis = preis;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return genre + ";" + titel + ";" + spielzeit + ";" + preis;
    }

    
    @Override
    public int compareTo(DVD o) {
        return this.titel.compareTo(o.titel);
    }
}
