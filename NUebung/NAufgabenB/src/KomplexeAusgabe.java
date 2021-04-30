// Import-Anweisung für unsere OutputStreams
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// Import-Anweisung für die Klasse Date, 
// damit wir ein Datum in die Datei schreiben können  
import java.util.Date;

public class KomplexeAusgabe
{
    public static void main(String[] args)
    {
        // Deklaration eines FileOutputStreams mit einer Null-Initialisierung
        FileOutputStream fos = null;
        try
        {
            // Erstellung eines FileOutputStreams, damit wir in die 
            // Datei t.tmp schreiben können
            fos = new FileOutputStream("t.tmp");

            // Deklaration eines ObjectOutputStreams 
            // mit einer Null-Initialisierung
            ObjectOutputStream oos = null;

            try
            {
                // Neuer ObjectOutputStream, der die Schreibmethode enthält, 
                // wird erzeugt, indem der FileOutputStream dem Konstruktor 
                // übergeben wird
                oos = new ObjectOutputStream(fos);

                // Die Methode writeInt schreibt einen einfachen 
                // int-Datentypen in die Datei
                oos.writeInt(12345);

                // Die Methode writeObject schreibt komplexe 
                // Datentypen in die Datei
                oos.writeObject("Today");
                oos.writeObject(new Date());
            }
            // Fehlerbehandlung, falls ein Fehler beim 
            // eigentlichen Schreiben auftritt
            catch (IOException ex)
            {
                // Ausgabe der Aufruferliste im Fehlerfalle
                ex.printStackTrace();
            }
            // Schließe auf jeden Fall den ObjectOutputStream
            finally
            {
                try
                {
                         // Überprüfung, ob oos überhaupt initialisiert wurde
                         if(oos!=null)
                         {
                               oos.close();
                          }
                }
                catch (IOException ex)
                {
                    // Ausgabe der Aufruferliste im Fehlerfalle
                    // Könnte man beim Close ignorieren, da der 
                    // ObjectOutputStream in der Regel dann nicht mehr 
                    // vorhanden ist                    
                    ex.printStackTrace();
                }
            }
        }
        // Auffangen der FileNotFoundException, falls die Datei,
        // die beschrieben werden soll, nicht gefunden werden konnte        
        catch (FileNotFoundException ex)
        {
             // Ausgabe der Aufruferliste im Fehlerfalle
            ex.printStackTrace();
        }
        // Schließe auf jedenfall den FileOutputStream
        finally
        {
        try
            {
                // Überprüfung,ob fos überhaupt initialisiert wurde
                if(fos!=null)
                {
                      fos.close();
                 }
            }
            catch (IOException ex)
            {
                // Ausgabe der Aufruferliste im Fehlerfalle
                // Könnte man beim Close ignorieren, da der ObjectOutputStream
                // in der Regel dann nicht mehr vorhanden ist
                ex.printStackTrace();
            }
        }
    }
}


