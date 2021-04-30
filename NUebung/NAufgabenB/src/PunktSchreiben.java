
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;
 
public class PunktSchreiben
{
 
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        try
        {
            Punkt p2 = new Punkt();
            p2.setX(33);
            Punkt p = new Punkt();
            p.setX(22);
            Vector vec = new Vector();
            vec.add(p);
            vec.add(p2);

            // Erstellung eines FileOutputStreams, damit wir in die Datei 
            // punkt.tmp schreiben können       
            fos = new FileOutputStream("punkt.tmp");

            ObjectOutputStream oos = null;

            try
            {
                // ObjectOutputStreams, der die eigentliche 
                // Schreibmethode enthält, wird mit dem 
                // FileOutputStream erzeugt.
                oos = new ObjectOutputStream(fos);

                // Schreiben des Vektors in eine Datei mit den Objekten 
                // der Klasse Punkt
                oos.writeObject(vec);
 
            }
             // Fehlerbehandlung, falls ein Fehler beim eigentlichen 
            // Schreiben auftritt
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
                    // vorhanden ist.
                    ex.printStackTrace();
                }
            }
 
        }
        // Auffangen der FileNotFoundException, falls die 
        // Datei, die beschrieben werden soll,
        // nicht gefunden werden konnte
        catch (FileNotFoundException ex)
        {
            // Ausgabe der Aufruferliste im Fehlerfalle
            ex.printStackTrace();
        }
        // Schließe auf jeden Fall den FileOutputStream
        finally
        {
            try
            {
                // Überprüfung, ob fos überhaupt initialisiert wurde
                if(fos!=null)
                {
                    fos.close();
                }
            }
            catch (IOException ex)
            {
                // Ausgabe der Aufruferliste im Fehlerfalle
                // Könnte man beim Close ignorieren, da der 
                // ObjectOutputStream in der Regel dann nicht 
                // mehr vorhanden ist                
                ex.printStackTrace();
            }
        }
    }
}


